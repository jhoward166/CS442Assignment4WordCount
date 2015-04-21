package wordCount.driver;

import wordCount.util.FileProcessor;
import wordCount.treesForStrings.BST;
import wordCount.visitors.PopulateTreeVisitor;
import wordCount.visitors.WordCountVisitor;

public class Driver{
    public static void main(String[] args){
        //LOGGER_VALUE = Integer.parseInt(args[0]);
        String inputFile = args[1];
        String outputFile = args[2];
        int iterations = Integer.parseInt(args[3]);
        System.out.println("I am a driver!");
        long startTime = System.currentTimeMillis();
        for(int i=0; i<iterations; i++){
            BST tree = new BST();
            PopulateTreeVisitor populate = new PopulateTreeVisitor(inputFile, outputFile);
            WordCountVisitor count = new WordCountVisitor(inputFile, outputFile);
            tree.accept(populate);
            tree.accept(count);
        }
        long finishTime = System.currentTimeMillis();
        long totalTime = finishTime - startTime;
        long avgTime = totalTime/iterations;
        System.out.println(avgTime); 
    }
}
