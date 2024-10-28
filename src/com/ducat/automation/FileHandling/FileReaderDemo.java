package com.ducat.automation.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    static String filepath = "C:\\Users\\poc56\\OneDrive\\Documents\\GitHub\\Hello.txt";
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader(filepath);
      //  FileReader fr1 = new FileReader(new File());
        while(fr.read()!=-1) {

            System.out.print((char) fr.read());

        }

        // fr.read();
    }
}
