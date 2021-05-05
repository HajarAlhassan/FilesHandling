package com.tts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
try{
    File file=new File("test.txt");

    if(file.createNewFile()){
        System.out.println("New file was created: "+file.getName());

    }else{
        System.out.println("The file already exist");
    }}catch(IOException e){
        System.out.println("An error occurred");
        e.printStackTrace();
    }
}

}
