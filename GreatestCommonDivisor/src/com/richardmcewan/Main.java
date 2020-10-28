package com.richardmcewan;

/*
method
getGreatestCommonDivisor
return int (the GCD)
two parameters
int first, int second
if either < 10 return false


 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));

    }

    public static int getGreatestCommonDivisor(int first, int second){
    if(first < 10 || second < 10){
        //report invalid value
        return -1;
        }

        // swop parameters so smallest number first
        if(first > second){
            getGreatestCommonDivisor(second, first);

        }

        //find GCD of two numbers
        int greatestCommonDivisor = 1;
        for(int i = first; i>1; i--){
            if((first % i == 0) && (second % i==0)){
                greatestCommonDivisor = i;
                break;
            }
        }
    return greatestCommonDivisor;
    }



    //end of main curly
}
