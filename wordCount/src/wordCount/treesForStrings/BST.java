package wordCount.treesForStrings;

import wordCount.visitors.Visitor;

public class BST{
	private Node root;
	private int totalNumWords = 0;
	private int numUniqueWords = 0;
	private int totalChars = 0;
	
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
    
    public Node getRoot(){
        return root;
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

	public void accept(Visitor visitor){ //accept the visitor
		visitor.visit(this);
	}

}
