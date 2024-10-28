package com.ducat.automation.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

    static String pathname = "C:\\Users\\poc56\\OneDrive\\Documents\\GitHub\\Hello.txt";

    public static void main(String[] args) throws FileNotFoundException {

        //PrintWriter pw1 = new PrintWriter(pathname);
        PrintWriter pw2 = new PrintWriter(new File(pathname));
        pw2.print("Hi Team how are you ");
        pw2.flush();



    }
}
