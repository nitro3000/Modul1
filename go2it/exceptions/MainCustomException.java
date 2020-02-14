package com.go2it.exceptions;

public class MainCustomException {

    public static void main(String[] args) {
        ClassToThrowException test2 = new ClassToThrowException ("title2", 0);
        ClassToThrowException test3 = new ClassToThrowException ("title3", 4);
        try {
            System.out.println ("test this line 1");
            test2.setNumber (0);
            test3.setNumber (4);
        } catch (CustomException e) {
            System.out.println ("caught custom checked exception");
        } catch (CustomRTException e) {
            System.out.println ("blah");
        }
        System.out.println ("test this line 2");
    }
}
