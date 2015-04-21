package wordCount.visitors;

import wordCount.util.FileProcessor;
import wordCount.treesForStrings.BST;

public class PopulateTreeVisitor implements Visitor{
    private FileProcessor proc;
    
    public PopulateTreeVisitor(String inFileName, String outFileName){
        proc = new FileProcessor(inFileName, outFileName);
    }
    //mock so it will compile, remove when other files are implemented
    public void visit(BST tree){
        String nextWord = proc.readWord();
        while(nextWord != null){
            tree.insert(nextWord);
            nextWord = proc.readWord();
        }                    
    }
}
