package com.richardmcewan;

public class Main {

    public static void main(String[] args) {
	// write your code here



        System.out.println(getLargestPrime(45));
        //System.out.println(getLargestPrime(0));
        //System.out.println(getLargestPrime(45));
        //System.out.println(getLargestPrime(-1));

    }

    public static int getLargestPrime(int number) {
        if (number < 2) return -1;

        int prime = 0;
        int count = 1;


        while (number > count){
            count ++;
            if (number % count == 0){
                if(prime < count) prime = count;
                number = number / count;
                getLargestPrime(number);
                count = 1;
            }
        }
        return prime;
    }

    //end of main curly
}













