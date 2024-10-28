package com.ducat.automation.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Filehandling1 {

    public static void main(String[] args) throws IOException {
        File fle = new File("D:\\SELENIUM\\demodir\\new.txt");
        fle.createNewFile();


        System.out.println(fle.isFile());
        System.out.println( fle.isDirectory());




    }
}