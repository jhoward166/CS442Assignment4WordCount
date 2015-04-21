package wordCount.driver;

<<<<<<< HEAD
import wordCount.util.FileProcessor;
=======
import wordCount.treesForStrings.BST;
>>>>>>> d3a336ea4ad259b0786441a420da6b25a418cd00

public class Driver{
    public static void main(String[] args){
        System.out.println("I am a driver!");
<<<<<<< HEAD
        FileProcessor proc = new FileProcessor("test.txt","idk.txt");
        String nextWord = proc.readWord();
        while(nextWord != null){
            System.out.println(nextWord);
            nextWord = proc.readWord();
        }
        if(nextWord == null){
            System.out.println(nextWord);
        }
=======
		

>>>>>>> d3a336ea4ad259b0786441a420da6b25a418cd00
    }
}
