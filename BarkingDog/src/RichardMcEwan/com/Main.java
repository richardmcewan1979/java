package RichardMcEwan.com;

/*
 BarkingDog with shouldWakeUP method
 return Type Boolean
 takes 2 parameters
 1st: Boolean barking
 2nd: int hourOfDay; range 0-23
 Control flow:
 if (hourOfDay < 0 || hourOfDay > 23) return false
 else (barking < 8 || barking > 22) return true
 else return false

TESTS PASSED
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

Console output as expected
true
false
false
false

*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }

        //see alternative below
        else if ((barking) && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        }

        return false;

        /*this does the job with less code but is unclear
        else return barking && (hourOfDay < 8 || hourOfDay > 22);
        */
    }



    //end of the Main class curly
}
