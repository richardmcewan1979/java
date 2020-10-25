package com.richardmcewan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println(isEvenNumber(10));

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number " + number);
            evenNumbersFound++;
            if(evenNumbersFound>=5){
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number){
        return ((number % 2) == 0);

    }
}
