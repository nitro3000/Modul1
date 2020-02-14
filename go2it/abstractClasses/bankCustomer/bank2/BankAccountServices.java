package com.go2it.abstractClasses.bankCustomer.bank2;

public interface BankAccountServices {
    int openAccount(int accountNumber);
    int closeAccount(int accountNumber);
    double fee();
    double deposit(double desireAmount);
    double withdraw(double desireAmount);

}
