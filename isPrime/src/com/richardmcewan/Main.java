package com.richardmcewan;

public class Main {

    public static void main(String[] args) {

        checkPrime(1,101);
    }

    public static boolean isPrime(int n){

        if(n==1) {
            return false;
        }

        for(int i=2; i <=n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void checkPrime(int start, int end ){
        int count = 0;
        for(int i=start; i < end+1; i++){
            if(isPrime(i)==true){
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
