package com.tts;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        System.out.println("****************** Delete a folder **************");
        File folder = new File("C:\\java\\Test");//notice using the escape character \
        if (folder.delete()) {
           System.out.println("Deleted the folder: " + folder.getName());
        } else {
        System.out.println("Failed to delete the folder.");
       }
        System.out.println("****************** Delete a file **************");
        File file = new File("C:\\java\\Test.txt");
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

}
