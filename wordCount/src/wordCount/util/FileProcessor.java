package wordCount.util;

import java.io.PrintWriter;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor{
    private Scanner scannerIn;
    private String nextWord;
    private BufferedWriter buffWriter = null;

    public FileProcessor(String inFileName, String outFileName){
        try{
            File inFile = new File(inFileName);
            scannerIn = new Scanner(inFile);
            PrintWriter writer = new PrintWriter(outFileName);
            writer.close();
            buffWriter = new BufferedWriter(new FileWriter(outFileName, true));
        }catch(FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
        }catch(IOException ioe){
            System.out.println("I/O Exception");
        }
    }

    public String readWord(){
        if(scannerIn.hasNext()){
            return scannerIn.next();
        }else{
            return null;
        }
    }
    
    public void writeToFile(String message) throws IOException{
        buffWriter.write(message);
        buffWriter.newLine();
        buffWriter.flush();
    }
}
