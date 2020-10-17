package RichardMcEwan.com;

/*
Requirements hasEqualSum method:
Return type bool.
3 parameters, of type int.
a, b, c.
If a+b == c; return true; else false.

Test: (passed)

System.out.println( hasEqualSum(1, 1, 1));
System.out.println( hasEqualSum(1, 1, 2));
System.out.println( hasEqualSum(1, -1, 0));

console:
false
true
true

 */


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println( hasEqualSum(1, 1, 1));
        System.out.println( hasEqualSum(1, 1, 2));
        System.out.println( hasEqualSum(1, -1, 0));

    }

    public static boolean hasEqualSum(int a, int b, int c){

        return a+b == c;

    }


    //end of main curly
}
