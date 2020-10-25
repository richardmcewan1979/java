package com.richardmcewan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigit(123456));
    }

    public static int sumDigit(int number){

        if (number < 10){
            return -1;
        }

        int sum = 0;
        while(number > 0){
            int part = (number %10);
            sum = sum + part;
            number = number / 10;
        }
        return sum;

    }

    /*
    //my initial code: didn't require awkward break
    //repetitive and while loop should break
    public static int sumDigit(int number){

        if (number < 10){
            return -1;
        }

        int sum = 0;
        while(true){
            int part = (number %10);
            sum = sum + part;
            number = number / 10;

            if (number < 9){
                sum = sum + number;
                break;
            }
        }
        return sum;



        //tim code
        private static int sumDigits(int number){
            if(number < 10){
                return -1;
            }

            int sum = 0;
            while(number>0){
                //extract least significant number
                int digit = number %10;
                sum += digit;
                //drop he least significant number
                number /=10;
            }
            return sum;
        }

*/

    //end of curly
}
