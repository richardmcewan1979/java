package com.richardmcewan;

/*
method
printFactors
one parameter type int called number 
prints all factors
return -1 if number < 1
print numbers on separate lines

note is this return int or void with print out?

Tests passed. 

 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number){

        //check invalid parameter
        if(number < 1){
            System.out.println("Invalid Value");
        }

        //print factors
        for(int i = 1; i<number+1; i++){
            if((number % i == 0)){
                System.out.println(i);
            }
        }

    }

    //end of main curly
}
