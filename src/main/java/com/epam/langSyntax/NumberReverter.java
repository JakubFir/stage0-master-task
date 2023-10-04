package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int lastDigit = number % 10;
        int middleDigit = (number / 10) % 10;
        int firstDigit = number / 100;
        System.out.println(lastDigit+""+middleDigit+""+firstDigit);
    }

}
