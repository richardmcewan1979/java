package com.richardmcewan;

/*
Two methods...

Method 1:
hasSameLastDigit
three parameters
type ints
return true if at least two of the numbers share the last digit
else return false

method 2:
isValid
boolean
one parameter int
range 10-1000 inclusive
if outside of range return false
else true

Tests:
passed input/output examples

research:
https://stackoverflow.com/questions/1514910/how-to-properly-compare-two-integers-in-java
tried some of the functions but did not work. e.g. if (x.intValue() == y.intValue()).
They may be deprecated so need to review at length.

notes:
Java is pass by value
"==" checks refer to same object rather than equal objects.
I guess that is what i want but not sure, int is a primitive type so 10 is 10?

 */
public class Main {

    public static void main(String[] args) {

        //check

        System.out.println("Check isValid method\n");
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));

        System.out.println("\nCheck hasSameLast Digit method\n");

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int a, int b, int c){

        //check values in range 10 to 1000 inclusive
        if(!isValid(a)){
            return false;
        }

        if(!isValid(b)){
            return false;
        }

        if(!isValid(c)){
            return false;
        }

        //collect last digit
        a %= 10;
        b %= 10;
        c %= 10;

        //check if at least two are the same
       return (b == a) || (a == c) || (b == c);
    }


        public static boolean isValid(int number){
            return number >= 10 && number <= 1000;
        }

    //end of main curly
}
