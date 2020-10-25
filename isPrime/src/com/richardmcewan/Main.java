package com.richardmcewan;

public class Main {

    public static void main(String[] args) {

        //my version
        checkPrime(1,101);
        //Tim version
        System.out.println("\n******************");
        int count = 0;
        for(int i=10; i<50;i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n){

        if(n==1) {
            return false;
        }

        for(int i=2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void checkPrime(int start, int end ){
        int count = 0;
        for(int i=start; i < end+1; i++){
            if(isPrime(i)){
                System.out.format("\n%d prime is: " + i, count+1);
                count +=1;
                if(count==25) {
                    break;
                }
            }
        }

    }

    //end of main curly
}
