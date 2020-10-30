package com.richardmcewan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        //String to int
        String numberAsString = "12345";
        int numberAsInt = Integer.parseInt(numberAsString);

        //int to string
        int anotherNumberAsInt = 9876;
        String backToNumberAsString = String.valueOf(anotherNumberAsInt);
         */

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }




        public static int getDigitCount(int number){
            if (number < 0){
                return -1;
            }
            int lengthOfNumber = String.valueOf(number).length();
            return lengthOfNumber;
        }

        //works
        // public static int reverse(int number){
        //     boolean flag = false;

        //     if (number < 0){
        //         flag = true;
        //         number = number * -1;
        //     }
        //     int temp = number % 10;
        //     String reversedNumberAsString = "";

        //     while (number != 0) {
        //         reversedNumberAsString += String.valueOf(temp);
        //         number= number / 10;
        //         temp = number %10;
        //     }
        //     int numberAsInt = Integer.parseInt(reversedNumberAsString);
        //     if (flag==true){
        //         numberAsInt *= -1;
        //     }
        //     return numberAsInt;
        // }
        public static int reverse(int number) {
            int reverse = 0;
            while(number!=0) {
                reverse = (reverse * 10) + number % 10;
                number /= 10;
            }
            return reverse;
        }

        public static void numberToWords(int number){
            if (number < 0){
                System.out.println("Invalid Value");
            }
            else if (number == 0) { // added this code block to handle just 0
                System.out.println("Zero");
            }

            String result = "";

            int numberToWords = reverse(number);
            int zerosToAdd = getDigitCount(number) - getDigitCount(numberToWords);

            while (numberToWords > 0) {
                int part = numberToWords % 10;
                numberToWords = numberToWords / 10;


                switch (part) {
                    case 0:
                        result += "Zero "; // add space to separate words for every case
                        break;
                    case 1:
                        result += "One ";
                        break;
                    case 2:
                        result += "Two ";
                        break;
                    case 3:
                        result += "Three ";
                        break;
                    case 4:
                        result += "Four ";
                        break;
                    case 5:
                        result += "Five ";
                        break;
                    case 6:
                        result += "Six ";
                        break;
                    case 7:
                        result += "Seven ";
                        break;
                    case 8:
                        result += "Eight ";
                        break;
                    case 9:
                        result += "Nine ";
                        break;

                    default:
                        result += "Debug: Launch default value";
                        // break; // unnecessary if last
                }

            }
            for (int i=0; i < zerosToAdd; i++) {
                result += "Zero ";
            }

            System.out.println(result);

        }
    }



