package com.tts;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
     try{
         FileWriter myWriter=new FileWriter("test.txt");
         myWriter.write("We are writing to an already exists file");
         myWriter.close();
         System.out.println("Successfully wrote to the file");
     }catch (IOException e){
         e.printStackTrace();
     }
    }
}
