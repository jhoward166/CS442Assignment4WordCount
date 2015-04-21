package wordCount.treesForStrings;

import wordCount.visitors.Visitor;
import wordCount.util.Logger;

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
        Logger.printToStdout(3, "A node has been inserted into the tree.");
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

	public void accept(Visitor visitor){ //accept the visitor
		visitor.visit(this);
	}

}
