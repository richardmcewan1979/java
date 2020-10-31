package com.richardmcewan;


/*
Method canPack
parameters: three ints
bigCount
smallCount
goal
return bool

return false if any parameters are negative.

return true if smallCount+bigCount=goal
or true if,
some combination of bags can be packed.
false if excess such as:
2 big and goal was 9 as we cannot divide a bag.
 */

public class Main {

    public static void main(String[] args) {
        // write your code here

        //System.out.println(canPack(1,0,4));
        //System.out.println(canPack(1,0,5));
        //System.out.println(canPack(0,5,4));
        //System.out.println(canPack(2,2,11));

        System.out.println(canPack(-3,2,12));


    }


        public static boolean canPack( int bigCount, int smallCount, int goal){

            if (bigCount < 0 || smallCount < 0) return false;

            for (int i = bigCount; i >= 0; i--) {
                for (int j = smallCount; j >= 0; j--) {
                    if ((i* 5) + j == goal) return true;
                }
            }
            return false;
        }

    //end of main curly
}
