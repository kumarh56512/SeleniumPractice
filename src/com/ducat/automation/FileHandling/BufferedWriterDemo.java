package com.ducat.automation.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\poc56\\OneDrive\\Documents\\GitHub\\Happy.txt"));
        bw.write("this is my room ");
        bw.newLine();
        bw.write("this is my table");
        bw.newLine();
        bw.write("this is my bed");
        bw.flush();


    }
}
