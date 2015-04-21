package wordCount.vistors;

import wordCount.util.FileProcessor;


public class PopulateTreeVisitor{
    private FileProcessor proc;
    public PopulateTreeVisitor(String inFileName, String outFileName){
        proc = new FileProcessor(inFileName, outFileName);
    }
    //mock so it will compile, remove when other files are implemented
    public class BST{
        public String addNode(String word){
            return word;
        }
    }
    public void visit(BST tree){
        FileProcessor proc = new FileProcessor("test.txt", "idk.txt");
        String nextWord = proc.readWord();
        while(nextWord != null){
            addNode(nextWord);
            nextWord = proc.readWord();
        }                    
    }
}
