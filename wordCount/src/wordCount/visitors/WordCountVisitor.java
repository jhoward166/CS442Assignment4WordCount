package wordCount.visitors;

import wordCount.treesForStrings.BST;
import wordCount.treesForStrings.Node;
import wordCount.util.FileProcessor;
import java.io.IOException;

public class WordCountVisitor implements Visitor{
    private FileProcessor proc;
    int totalNumWords = 0;
    int totalChars = 0;
    int numUniqueWords = 0;

    public WordCountVisitor(String inFileName, String outFileName){
        proc = new FileProcessor(inFileName, outFileName);
    }

    public void visit(BST tree){
        inorder(tree.getRoot());
        try{
            proc.writeToFile("Total word count: "+totalNumWords);
            proc.writeToFile("Total character count: "+totalChars);
            proc.writeToFile("Number of unique words: "+numUniqueWords);
        }catch(IOException ioe){
            System.out.println("An IO Exception has occured.");
        }
    }

    private void inorder(Node n){
        if(n != null){
            inorder(n.getLeft()); 
            totalNumWords += n.getInstanceCount();
            totalChars += n.getNumChars(); 
            numUniqueWords++;
            inorder(n.getRight()); 
        }
    }
}
