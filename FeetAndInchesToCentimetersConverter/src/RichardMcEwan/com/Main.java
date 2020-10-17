package RichardMcEwan.com;

/*
Two methods to convert feet and inches to centimeters.
Method overloading

Requirements:

Method1: calcFeetAndInchesToCentimeters
coverts feet and inches to cm.
return double
two parameters, type double; feet and inches
validate parameter inches >= 0.
validate parameter feet >= 0 && feet <=12; if not return -1
Perform calculation
return cm

Method2: calcFeetAndInchesToCentimeters
return double
one parameter, inches; type double
validate inches >= 0; if not return -1
return: call method1(feet, inches)


conversion metric:
1 inch = 2.54cm
1 foot = 12 inches

Tests:

Appears to pass tests.

notes:

ma


 */



public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(calcFeetAndInchesToCentimeters(500));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
       if (inches < 0 || inches > 12 || feet < 0 ) {
           System.out.println("Invalid feet and/ or inches parameters");
           return -1;}

       else {
            double feetToInchesToCentimetres = (feet * 12) * 2.54;
            double inchesToCentimetres = inches * 2.54;
           double centimeters = feetToInchesToCentimetres + inchesToCentimetres;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm." );

            return centimeters;
       }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0 )
        {
            System.out.println("Invalid feet inches parameter");
            return -1;}

        else if (inches < 13) {
            return calcFeetAndInchesToCentimeters(0, inches);
        }

        else {
            double inchesToFeet = inches / 12;
            double feet = (int) (inchesToFeet);
            double remainderInches = inches - (feet*12);
            return calcFeetAndInchesToCentimeters(feet, remainderInches);

        }
    }

    //end of Main curly
}
