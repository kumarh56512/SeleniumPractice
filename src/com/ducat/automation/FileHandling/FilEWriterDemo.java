package com.ducat.automation.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FilEWriterDemo {

    static String pathname = "C:\\Users\\poc56\\OneDrive\\Documents\\GitHub\\Hello.txt";

    public static void main(String[] args) throws IOException {

        FileWriter ftw = new FileWriter(pathname);
        ftw.write("my name is harendra");
        ftw.flush();

    }
}
