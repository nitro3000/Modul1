package com.go2it.homework1;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class homework1LocalDate {

    public static void main(String[]args) {
        LocalDate Id = LocalDate.now();
        Date chislo = Date.from(Id.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date date1 = java.sql.Date.valueOf(Id);
        System.out.println(chislo);
        System.out.println(date1);
    }
}