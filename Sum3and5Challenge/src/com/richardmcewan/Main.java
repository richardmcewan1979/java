package com.richardmcewan;

// sum numbers in range that are divisible by 3 and 5

public class Main {

    //Global variables, check syntax do I need to modify access to private/protected final etc
    //Adjust range
    protected static final int startRange = 1;
    protected static final int endRange = 1000;
    //divisors to check
    protected static final int firstDivisor = 3;
    protected static final int secondDivisor = 5;
    //How many qualifying numbers to sum
    protected static final int elementsToSum = 5;

    public static void main(String[] args) {

        sumNumbers(startRange,endRange);

    }

    public static void sumNumbers(int start, int end){
        int count = 0;
        int sum = 0;
        for(int i = start; i < end+1; i++){
            if(((i % firstDivisor) == 0) && ((i % secondDivisor) == 0)){
                count += 1;
                System.out.println("Found number = " + i);
                sum +=i;
                if (count == elementsToSum){
                    System.out.println("The sum of first " +
                            elementsToSum + " qualifying numbers = " + sum);
                    break;
                }
            }
        }
    }
}
