package wordCount.visitor;

import wordCount.util.FileProcessor;

public class WordCountVisitor{
    private FileProcessor proc;
    public WordCountVisitor(String inFileName, String outFileName){
        proc = new FileProcessor(inFileName, outFileName);
    }
    public void visit(BST tree){
                
    }
}
