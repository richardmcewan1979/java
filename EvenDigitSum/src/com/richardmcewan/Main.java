package com.richardmcewan;

public class Main {

    public static void main(String[] args) {
        // write your code here


        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));


    }


    public static int getEvenDigitSum(int number){

        //check for invalid value
        if(number<0){
            return -1;
        }

        int sum = 0;

        while(number>0){
            //clip last digit
            int a = number / 10;
            int lastDigit = number - a*10;


            //sum last digit if even
            if (lastDigit%2==0){
                sum +=lastDigit;
            }

            //lose the last digit, start over
            number = number /10;


        }
        return sum;
    }
    //end of main curly
}
