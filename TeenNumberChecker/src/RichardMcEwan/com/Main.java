package RichardMcEwan.com;

/*
Two methods.

hasTeen
return type bool
3 parameters, type int
return true if a or b or c is in range (13-19 inclusive); else false

isTeen
return type bool
1 parameters, type int
return true if a in range (13-19 inclusive)

TESTS Passed:

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));

Console output:
true
true
false
false
true

 */


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int a, int b, int c){
        boolean d = (a >= 13 && a <= 19);
        boolean e = (b >= 13 && b <= 19);
        boolean f = (c >= 13 && c <= 19);
        return (d || e || f);
    }

    public static boolean isTeen(int a){
        return (a >= 13 && a <= 19);

    }

    //end curly of main
}
