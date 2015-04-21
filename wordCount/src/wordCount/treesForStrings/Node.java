package wordCount.treesForStrings;

public class Node{
	protected Node left;
	protected Node right;
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
