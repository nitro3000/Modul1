package com.go2it.methods;

public class ATM {

    private final String ccNumber1 = "1234 1234 1234 9999";
    private final String ccPin1 = "012";
    private int ccBalance1 = 100;
    private final String ccNumber2 = "1234 1234 1234 0000";
    private final String ccPin2 = "345";
    private int ccBalance2 = 350;

    public int withdrawCashFromCreditCard (String cardNumber, String pin, int sumToWithdraw) {
        if (cardNumber.equals(ccNumber1)) {
            if (ccPin1.equals(pin)) {
                if (sumToWithdraw<= ccBalance1){
                    System.out.println(sumToWithdraw + " was withdrawn successfully");
                    return sumToWithdraw;
                }
                System.out.println("Sum exceeds the balance");
            }
        } else if (cardNumber.equals(ccNumber2)) {
            if (ccPin2.equals(pin)) {
                if (sumToWithdraw<= ccBalance2) {
                    System.out.println(sumToWithdraw + " was withdrawn successfully");
                    return sumToWithdraw;
                }
                System.out.println("Sum exceeds the balance");
            }
        } else {
            System.out.println("CC number was not found");
        }
        return 0;
    }

    public static void main(String[] args) {
        ATM atmWeWantToUse =new ATM ();
        System.out.println(atmWeWantToUse.withdrawCashFromCreditCard("1234 1234 1234 9999", "012", 100));
    }
}
