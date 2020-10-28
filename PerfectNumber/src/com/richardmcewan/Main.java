package com.richardmcewan;

/*
method
isPerfectNumber
one parameter type in called number
return bool
true if number perfect
false if number < 1
false if number not perfect

definition of perfect number:
factors of a number sum to number (excluding itself as a factor)
true: 6 = 1+2+3 = 6
false: 10 = 1+2+5 = 8

Passed tests / requirement
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number){

        //check invalid parameter
        if(number < 1){
            return false;
        }

        //find factors (exclude itself as factor)
        //see definition of a perfect number above
        //sum those factors
        int sum = 0;
        for(int i = 1; i<number; i++){
            if((number % i == 0)){
                sum += i;
            }
        }
        //returns true if number perfect, else false
        return (sum == number);
    }
    //end of main curly
}
