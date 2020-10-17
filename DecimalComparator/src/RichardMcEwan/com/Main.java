package RichardMcEwan.com;

/*

Requirements
areEqualsByThreeDecimalPlaces method:
return type bool
two parameters, type doubles
check if the two numbers are are equal to 3dp
must use casting

Required TESTS Passed:

System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

Console output:

true
false
true
false

Learning notes: if doubleNumber = 3.450; (int) doubleNumber * 1000; returns int 3000.
Above casts double to 3 then multiplies
Below multiplies, then casts. So desired truncation performed correctly.
Required brackets due to order of operations:
if doubleNumber = 3.450; (int) (doubleNumber * 1000); returns int 3450.

 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstDecimal, double secondDecimal){

        int firstNumber = (int) (firstDecimal * 1000);
        int secondNumber = (int) (secondDecimal * 1000);

        //System.out.println(firstNumber);

        return firstNumber == secondNumber;
    }
}
