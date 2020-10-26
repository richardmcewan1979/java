package com.richardmcewan;

/*
method
public static
return bool
hasSharedDigit
two parameters, type int
input range (10-99) inclusive
else return false
return true if both numbers share a digit

test:
Passed example input/output

 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int a, int b){
        if((a < 10 || a >99)){
            return false;
        }
        else if((b < 10 || b >99)){
            return false;
        }

            //separate digits
            int firstDigit = a /10;
            int secondDigit = a % 10;

            int thirdDigit = b /10;
            int fourthDigit = b % 10;

            //check for equality
            boolean checkFirstDigit = (firstDigit == thirdDigit || firstDigit == fourthDigit );
            boolean checkSecondDigit = (secondDigit == thirdDigit || secondDigit == fourthDigit );

        return checkFirstDigit || checkSecondDigit;
    }

}
