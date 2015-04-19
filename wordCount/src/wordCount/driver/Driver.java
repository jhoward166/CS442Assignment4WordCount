package wordCount.driver;

import wordCount.util.FileProcessor;

public class Driver{
    public static void main(String[] args){
        System.out.println("I am a driver!");
        FileProcessor proc = new FileProcessor("test.txt","idk.txt");
        String nextWord = proc.readWord();
        while(nextWord != null){
            System.out.println(nextWord);
            nextWord = proc.readWord();
        }
        if(nextWord == null){
            System.out.println(nextWord);
        }
    }
}
