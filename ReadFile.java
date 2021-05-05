package com.tts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
//        try{
//            File file=new File("test.txt");
//            Scanner reader=new Scanner(file);
//            while(reader.hasNextLine()){
//                String data=reader.nextLine();
//                System.out.println(data);
//            }
//            reader.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }


        try{
            File file=new File("test2.txt");
            if(file.createNewFile()){//Check if the file doesn't exist create and file
                System.out.println("file was created");
                FileWriter writer=new FileWriter("test2.txt");//we want to add lines to the created file
                writer.write("This is newly created file.\n I have just added these two lines.\nThanks");
                writer.close();
            }
                Scanner reader=new Scanner(file);//now we want to read that file and print it to the terminal
                while(reader.hasNextLine()){
                    String data=reader.nextLine();
                    System.out.println(data);
                }
                reader.close();
            } catch (FileNotFoundException fileNotFoundException) {//The best approach to handle exceptions is to have multiple catches
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

  try {
      File file =new File("test3.txt");
      File readFile=new File("test.txt");
      if(file.createNewFile()){
          System.out.println("This file was not exists");
          FileWriter writer=new FileWriter("test3.txt");
          Scanner reader=new Scanner(readFile);
          while (reader.hasNextLine()){
              String data= reader.nextLine();
              writer.write(data+"\n");

          }
          reader.close();
          writer.close();
      }
      File file1 =new File("test3.txt");//read the file after writing in from another file it and print it to the terminal
      Scanner reader=new Scanner(file1);
      System.out.println("reading from the new file after writing in it");
      while (reader.hasNextLine()){
          String data= reader.nextLine();
          System.out.println(data);
      }
      reader.close();
  }catch(IOException e) {
      e.printStackTrace();
  }

    }
}
