package wordCount.util;

import java.io.PrintWriter;
//import java.io.File;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
//import java.util.Scanner;
import wordCount.util.Logger;

public class FileProcessor{
    //private Scanner scannerIn;
    private BufferedReader buffReader = null;
    private String nextWord;
    private BufferedWriter buffWriter = null;

    public FileProcessor(String inFileName, String outFileName){
        try{
            //File inFile = new File(inFileName);
            //scannerIn = new Scanner(inFile);
            FileReader inFile = new FileReader(inFileName);
            buffReader = new BufferedReader(inFile);
            //PrintWriter writer = new PrintWriter(outFileName);
            //writer.close();
            buffWriter = new BufferedWriter(new FileWriter(outFileName, true));
        }catch(FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
        }catch(IOException ioe){
            System.out.println("I/O Exception");
        }
    }

    public String readWord(){
        Logger.printToStdout(1, "The file is being read from.");
        /*if(scannerIn.hasNext()){
            return scannerIn.next();
        }else{
            return null;
        }*/
        String nextLine = null;
        try{
            nextLine = buffReader.readLine();
        }catch(IOException ioe){
            System.out.println("An IO Exception has occurred.");
        }
        if(nextLine!=null){
            return nextLine.trim();
        }else{
            return null;
        }
    }
    
    public void writeToFile(String message) throws IOException{
        Logger.printToStdout(2, "The file is being written to.");
        buffWriter.write(message);
        buffWriter.newLine();
        buffWriter.flush();
    }
}
