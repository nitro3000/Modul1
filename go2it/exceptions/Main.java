package com.go2it.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        try {

            FileReader fileA = new FileReader ("Dog.class");
            BufferedReader bufferedReaderObj = new BufferedReader (fileA);

            for (int i = 0; i < 2; i++)
                System.out.println (bufferedReaderObj.readLine ( ));
            //fileInput.close ( );
        } catch (FileNotFoundException e) {
            System.out.println ("File not found");
        }


    }
}
