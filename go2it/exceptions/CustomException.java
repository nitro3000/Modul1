package com.go2it.exceptions;

//Create a class that will throw a custom exception (create your own descendant of RuntimeException)
// when its constructor is called every second time (use the counter of instances to track it).
// Create the instance of the class and handle the potential exception properly in main method


class CustomException extends Exception {
    public CustomException() {
    }

    public CustomException(String message) {
        super (message);
    }
}


