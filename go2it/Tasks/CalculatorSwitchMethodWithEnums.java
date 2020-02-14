package com.go2it.Tasks;

import java.util.Scanner;


public class CalculatorSwitchMethodWithEnums {

    public static double addition(double i, double j) {

        //Scanner consoleScanner = new Scanner (System.in); moved to main method,
        //int i = consoleScanner.nextInt ( ); changed to not void
        // int j = consoleScanner.nextInt ( ); changed to not void
        double sum = i + j;
        System.out.println ("The result of " + OperatorForCalculator.SUM + " is: " + sum);
        return (double) sum;
    }

    public static double subtraction(double i, double j) {

        double sub = i - j;
        System.out.println ("The result of " + OperatorForCalculator.SUBTRACTION + " is: " + sub);
        return (double) sub;
    }

    public static double division(double i, double j) {

        double div = i / j;
        System.out.println ("The result of " + OperatorForCalculator.DIVISION + " is: " + div);
        return (double) div;
    }

    public static double multiplication(double i, double j) {
        double mult = i * j;
        System.out.println ("The result of " + OperatorForCalculator.MULTIPLICATION + " is: " + mult);
        return (double) mult;
    }


    public static void main(String[] args) {
        try {
            Scanner consoleScanner = new Scanner (System.in);

            System.out.println ("Choose Operation : ( +, -, *, / )");
            String operator = consoleScanner.nextLine ( );
            if (!(operator.equals ("+")) || (!(operator.equals ("-")) || (!(operator.equals ("*")) || (!(operator.equals ("/"))))))
             {
                System.out.println ("There is NO such operation! Please choose between the  ( +, -, *, / )" );
                 return;
            }

            System.out.println ("Enter 1-st number here: ");
            double i = consoleScanner.nextDouble ( );


            System.out.println ("Enter 2-nd number here: ");
            double j = consoleScanner.nextDouble ( );

//                String j = getInput ("Enter 2-nd number here: ");
//                out.println (j);

//            for (Operator mathOperator: Operator.values ()) {
//                if (operator.equalsIgnoreCase (mathOperator.getOperation ())) {
//
//                }
//            }
            double result = 0;
            switch (operator) {

                case "+": {
                    addition (i, j);
                    break;
                }
                case "-": {
                    result = subtraction (i, j);
                    break;
                }
                case "/": {
                    result = division (i, j);
                    break;
                }
                case "*": {
                    result = multiplication (i, j);
                    break;
                }
                default:
                    System.out.println ("There is NO such operation! Please choose between the  ( +, -, *, / )");
                    break;
            }
            //System.out.println ("The result of " + Operator.SUBTRACTION + " is: " + result);


        } catch (Exception e) {
            System.out.println ("Number formatting exception " + e.getMessage ( ));
        }
    }

}
