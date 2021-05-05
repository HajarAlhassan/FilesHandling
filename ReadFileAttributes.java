package com.tts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileAttributes {
    public static void main(String[] args) {



 File file=new File("test.txt");
 if(file.exists()){
     System.out.println("The file name is: "+file.getName());
     System.out.println("Absolute path: " + file.getAbsolutePath());
     System.out.println("Is this file writable? "+ file.canWrite());
     System.out.println("Is this file readable? "+ file.canRead());
     System.out.println("The size of this file in bytes is "+ file.length()+" bytes");
 }else
     System.out.println("The file does not exist!!!!");
   }
}
