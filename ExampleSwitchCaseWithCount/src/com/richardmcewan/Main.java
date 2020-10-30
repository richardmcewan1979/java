package com.richardmcewan;

//this is a snippet from Eddie course tutor

public class Main {

    public static void main(String[] args) {
        // write your code here



        System.out.println(reverse(1234));

        int number = 1;
        int count = 1;

        //ignore next two lines
        //int count = getDigitCount(number);
        //number = reverse(number);

        //in the switch case this is the part that foxed me
        //System.out.println("number % 10=" + number%10);


        while (count > 0) {
            count--;
            switch (number % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
            }
            number /= 10;

        }
    }

    public static int reverse(int number) {
        int reverse = 0;

        while (number != 0) {
            System.out.println("number=" + number + " reverse=" + reverse);
            reverse = (reverse * 10) + number % 10;
            number /= 10;
        }
        return reverse;
    }

}
