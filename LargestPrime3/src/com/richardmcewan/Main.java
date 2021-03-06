package com.richardmcewan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(1));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(8));

    }

    public class LargestPrime {
    
    public static int getLargestPrime(int number){
        if(number < 2) return -1;
     
        // int prime = number;
        int i = 2;
     
        while (i < number){
            if(number % i == 0 ){
                // number = number / i;
                // prime = number;
                number /= i; // use this instead
                i--;
     
            }
            i++;
        }
        // return prime;
        return number; // simplifies what to return
    }
    }
    //end of main curly
}
