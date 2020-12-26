package com.richardmcewan;

/*

Read numbers from console and print sum
Note I added a request for how many numbers to sum (rather than just 10).

use hasNextInt() to check its an int

if false print "Invalid Number", continue reading numbers

use nextInt() to get next number and add to the sum

before user enters a number, print the message
"Enter number #x:" Where x represents the count

counter variable for counting valid numbers

close scanner after not needing


 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 1;
        int numbersToCount = 1;

        //

        System.out.println("How many numbers do you wish to sum?");
        boolean checkNextInt = scanner.hasNextInt();
        if (checkNextInt){
            numbersToCount = scanner.nextInt();
            scanner.nextLine(); //handle next line character
        } else {
            scanner.close();
            System.out.println("Input Invalid");
            System.out.println("Programme terminating...");
            System.exit(17);
        }


        while(counter < (numbersToCount+1)){
            System.out.println("Enter number #" + counter + ":");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
            int number = scanner.nextInt();
            sum += number;
            counter ++;
            } else {
                System.out.println("Invalid Number");
                System.out.println();

            }
            scanner.nextLine(); //handle next line character
        }
        scanner.close();
        System.out.println("The sum of 10 numbers is: " + sum);
    }
}
