package com.richardmcewan;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }


    public static boolean isPalindrome(int number) {
        if(number < 0){
            number = number * -1;
        }
        StringBuilder s = new StringBuilder();
        String original = String.valueOf(number);
        while (number > 0) {
            int part = (number % 10);
            s.append(String.valueOf(part));
            number = number / 10;
        }
        return (original.equals(s.toString()));
    }
}
