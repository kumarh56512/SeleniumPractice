package com.ducat.automation.FileHandling;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {

    static String filePath = "C:\\Users\\Development\\Downloads\\itsfordemo.txt";


    public static void main(String[] args) throws IOException {


        FileReader fr = new FileReader(filePath);

        while (fr.read() != -1) {
            System.out.print((char) fr.read());
        }

    }


}

