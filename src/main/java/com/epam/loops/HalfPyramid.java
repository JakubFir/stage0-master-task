package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for(int i =1; i <= cathetusLength; i ++){
            for(int k = i; k < cathetusLength; k++){
                System.out.print(" ");
            }
            for(int l = 1; l <= i; l ++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
