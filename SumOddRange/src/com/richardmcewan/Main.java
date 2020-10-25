package com.richardmcewan;



public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        */
        System.out.println(sumOdd(100,1000));

    }

    public static boolean isOdd(int number){
        return (number >= 0) && (number % 2 != 0);
    }

    public static int sumOdd(int start, int end){
        if (end < start || start < 0){
            return -1;
        }

        int sum = 0;
        for (int i = start; i < end + 1; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }


    //end of curly
}
