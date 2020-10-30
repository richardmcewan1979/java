package com.richardmcewan;

//This code supplied by Eddie the tutor of Tim Bulchalka Mastering Java on Udemy


public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));


        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

         */

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int count = getDigitCount(number);
        number = reverse(number);

        while (count > 0) {
            count --;
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
                case 4 :
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
            reverse = (reverse * 10) + number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int count = 0;

        if (number < 0) return -1;
        if (number == 0) count++;

        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
