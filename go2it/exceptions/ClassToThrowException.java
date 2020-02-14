package com.go2it.exceptions;

import java.io.FileNotFoundException;

public class ClassToThrowException {

    private String title;
    private int number;

    public ClassToThrowException(String title, int number) {
        this.title = title;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) throws CustomException,CustomRTException {
        if (number == 0) {
            throw new CustomException ("can't input zero");
        } else if (number % 2 == 0) {
            throw new CustomRTException ("input only odd numbers");
        }
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws FileNotFoundException {
        if (title == null || title.isEmpty ( ))
            throw new IllegalArgumentException ("the title was empty,couldn't set it up");
        //   throw new FileNotFoundException ("some random exception");
        this.title = title;
    }


}
