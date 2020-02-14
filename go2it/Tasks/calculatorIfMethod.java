package com.go2it.Tasks;
import java.util.Scanner;

import static java.lang.System.out;

public class calculatorIfMethod {

        public static void addition(){

            int number1;
            int number2;
            Scanner scan1 = new Scanner(System.in);

            System.out.println(OperatorForCalculator.SUM);

            System.out.print("\nFirst Number: ");
            number1 = scan1.nextInt();

            System.out.print("\nSecond Number: ");
            number2 = scan1.nextInt();

           // scanner.close();
            System.out.println("\nSum: " + number1 + " + " + number2 + " = " + (number1 + number2));
        }

        public static void subtraction(){
            int nOne;
            int nTwo;
            Scanner kb = new Scanner(System.in);

            System.out.println(OperatorForCalculator.SUBTRACTION);

            System.out.print("\nFirst Number: ");
            nOne = kb.nextInt();

            System.out.print("\nSecond Number: ");
            nTwo = kb.nextInt();

            kb.close();
            System.out.println("\nSum: " + nOne + " - " + nTwo + " = " + (nOne - nTwo));
        }

        public static void division(){
            int nOne, nTwo;
            Scanner kb = new Scanner(System.in);

            out.println(OperatorForCalculator.DIVISION);

            out.print("\nFirst Number: ");
            nOne = kb.nextInt();

            out.print("\nSecond Number: ");
            nTwo = kb.nextInt();

            kb.close();
            out.println("\nSum: " + nOne + " / " + nTwo + " = " + (nOne / nTwo));
        }

        public static void multiplication(){
            int nOne, nTwo;
            Scanner kb = new Scanner(System.in);

            out.println(OperatorForCalculator.MULTIPLICATION);

            out.print("\nFirst Number: ");
            nOne = kb.nextInt();

            out.print("\nSecond Number: ");
            nTwo = kb.nextInt();

            kb.close();
            out.println("\nSum: " + nOne + " x " + nTwo + " = " + (nOne * nTwo));
        }
        public static void main(String[] args) {

            Scanner kb = new Scanner(System.in);


            out.println("\nHere are your options:\n");
            out.println("1. " + OperatorForCalculator.SUM);
            out.println("2. " + OperatorForCalculator.SUBTRACTION );
            out.println("3. " + OperatorForCalculator.DIVISION);
            out.println("4. " + OperatorForCalculator.MULTIPLICATION);

            out.print("\nWhat would you like to do?: ");
            int choice = kb.nextInt();
            out.println();


            if (choice == 1){
                addition();
            }
            else if (choice == 2){
                subtraction();
            }
            else if (choice == 3){
                division();
            }
            else if (choice == 4){
                multiplication();
            }

            out.println();
            kb.close();
        }

    }
