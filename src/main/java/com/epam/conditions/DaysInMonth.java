package com.epam.conditions;

import java.util.Date;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if(month < 1 || month > 12 || year < 1){
            System.out.println("invalid date");
            return;
        }
        int daysInMonth;
        if(month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)  {
                daysInMonth = 29;
            } else {
                daysInMonth = 28;
            }
        }else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else {
            daysInMonth = 31;
        }
        System.out.println(daysInMonth);
    }

}
