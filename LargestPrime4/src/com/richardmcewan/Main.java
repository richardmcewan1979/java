package com.richardmcewan;

//This is Eddie instructor code from Mastering JAva with Tim Bulchalka

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getLargestPrime(217));
    }

    public static int getLargestPrime(int number) {
        if(number <= 1){
            return -1;
        }
        for(int i = number-1; i >= 2; i--) {
            System.out.println("i= " + i + " number= " + number);
            if(number % i == 0) {
                number = i; // assign new number and check if it's divisible
            }
        }
        return number; // if not divisible, it's the largest prime
    }

}
