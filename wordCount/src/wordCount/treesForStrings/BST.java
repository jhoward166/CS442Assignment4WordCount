package wordCount.treesForStrings;

public class BST{
	private Node root;
	private int totalNumWords = 0;
	private int numUniqueWords = 0;
	private int totalChars = 0;

	private class Node{
		private Node left;
		private Node right;
		private int instancesOfWord = 1;
		private int numCharsInWord = 0;
		private String word;

		public Node(String word){
			this.word = word;
			numCharsInWord = word.length();
		}
		
		public void incrementInstanceCount(){ //increments the number if the word is a duplicate
			instancesOfWord++; 
		}

		public String getWord(){
			return word;
		}
		
		public void setLeft(Node left){
			this.left = left;
		}
	
		public void setRight(Node right){
			this.right = right;
		}	

		public Node getLeft(){
			return left;
		}

		public Node getRight(){
			return right;
		}

		public int getNumChars(){
			return numCharsInWord * instancesOfWord;
		}

		public int getInstanceCount(){
			return instancesOfWord;
		}
	}
	
	public BST(){
		root = null;
	}

	public boolean isEmpty(){
		if(root == null){
			return true;
		}
		return false;
	}

	public void insert(String word){
		root = insertNode(root, word);
	}

	private Node insertNode(Node node, String word){
		if(node == null){
			node = new Node(word);
		}else{
			if(word.compareTo(node.getWord()) < 0){
				node.left = insertNode(node.left, word);
			}else if(word.compareTo(node.getWord()) > 0){
				node.right = insertNode(node.right, word);
			}else{
				node.incrementInstanceCount();
			}
		}
		return node;
	}

	//Traverse the tree to get a data value
	public int getNumWords(){
		inorder(root, 1);
		return totalNumWords;
	}

	public int getNumChars(){
		inorder(root, 2);
		return totalChars;
	}

	public int getNumUniqueWords(){
		inorder(root, 3);
		return numUniqueWords;
	}
	
	private void inorder(Node n, int selection){
		if(n != null){
			if(1 == selection){ //get total Num words in tree
				inorder(n.getLeft(), 1);
				totalNumWords += n.getInstanceCount();
				inorder(n.getRight(), 1);
			}else if(2 == selection){ // get total num of chars
				inorder(n.getLeft(), 2);
				totalChars += n.getNumChars();
				inorder(n.getRight(), 2);
			}else{// get total num of unique words
				inorder(n.getLeft(), 3);
				numUniqueWords++;
				inorder(n.getRight(), 3);
			}
		}
	}

/*	public void accept(Visitor visitor){ //accept the visitor
		//visitor.visitBST(this);
	}*/

}
