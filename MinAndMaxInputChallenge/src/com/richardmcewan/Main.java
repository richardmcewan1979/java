package com.richardmcewan;

/*
nice bug was here:

if user entered a min greater than zero
console returned 0

Two possibly solutions
1) enter Integer min and max to guarantee user overwrites
2) add a flag for first go around to assign user value to min and max
both implemented below for future reference.

 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        boolean first = true;

        System.out.println("Minimum and Maximum reader. Enter any letter to quit\n");

        while(true){
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int number = scanner.nextInt();

                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max){
                    max = number;
                }

                if (number < min){
                    min = number;
                }

            } else {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine(); //handle next line character
        }

        System.out.println("The min = " + min);
        System.out.println("The max = " + max);
        scanner.close();
    }

}
