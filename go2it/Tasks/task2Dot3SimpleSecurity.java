package com.go2it.Tasks;

// Security check: A user enters username and password in program arguments. If the password that is already present in Java code (see details below) is correct for this user,
// then program will welcome user with a message. Otherwise, ‘Incorrect username/password’ message will be shown. Example:  user enters: Alex qwertY1.
//  In Java code we will store username-password as: ‘Alex|qwertY1’ ( |`pipe` char is a separator, line should be split in order to get separate values).
//  If login successful, show ‘Welcome, ${username_from_console}!’. Otherwise, ‘Incorrect username/password’.
// Hint: to split the credentials (login/password) stored in Java use indexOf()  and substring() operations

public class task2Dot3SimpleSecurity {
    public static void main(String[] args) {
        String userPasswordDepart = "Alex|qwertY1|department";
        int pipe = userPasswordDepart.indexOf('|');                            //  only integer?
        int pipe2 = userPasswordDepart.lastIndexOf('|');
        //
        if (pipe == -1 || pipe2 == -1) {
            System.out.println("Credentials hve changed");
            return;
        }

        String arg1 = (args[0]);
        String arg2 = (args[1]);
       // String arg3 = (args[2]);


        String user = userPasswordDepart.substring(0, pipe);               // return string from begin to first "|"
        String password_depart = userPasswordDepart.substring(pipe + 1);        // return string from  first "|", without showing "|"
        String password = userPasswordDepart.substring(((pipe) + 1), (pipe2));        // return string from  first "|", to second"|" without showing "|"
        String depart = userPasswordDepart.substring((pipe2) + 1);


        if (user.equals(arg1) && password.equals(arg2)){
            System.out.println("Welcome, " + user + "!");
            System.out.println("Your Department is: " + depart);
        } else {
            System.out.println("Incorrect username/password");
        }


        //System.out.println(userPasswordDepart);
        //System.out.println(user);
        //System.out.println(password_depart);
        //System.out.println(password);
        //System.out.println(depart);


    }
}