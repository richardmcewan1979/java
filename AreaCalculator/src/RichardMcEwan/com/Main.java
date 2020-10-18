package RichardMcEwan.com;


/*
Method1 area
public static
one parameter radius
type double
if (r<0) return -1

method 2 overloaded area
public static
two parameters x, y; doubles
x, y sides of rect
x || y < 0; return -1

notes:
r*r*PI
x*y

constant Math.PI


 */


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1, 4.0));

    }

    public static double area(double radius){
        if (radius < 0){
            return -1;
        }
        else {
            double area = radius * radius * Math.PI;
            return area;
        }
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0){
            return -1;}
        else {
            double area = x * y;
            return area;
        }
    }

    //End of Main curly
}











