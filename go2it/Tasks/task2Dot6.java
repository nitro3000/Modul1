package com.go2it.Tasks;

public class task2Dot6 {
    public static void main (String[]args){

        String userNamePassword = "Alex|xXx2";
        String userName = "Alex";
        String password = "xXx2";
        String arg1 = "TestUser";
        String arg2 = "TestPassword";

        int pipe = userNamePassword.indexOf('|');
        //System.out.println(pipe);

        String user = userNamePassword.substring(0, pipe);
        System.out.println(user);



        if (user.equals(userName.contains("Alex"))) {
            System.out.println(userName.contains("Alex"));  // can use as boolean
            System.out.println(password.contains("xXx2"));  // can use as boolean
        }

    }

}
