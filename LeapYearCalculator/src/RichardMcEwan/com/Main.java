package RichardMcEwan.com;

/*
Method: isLeapYear
return bool
parameter year,
parameter type int
parameter range 1-9999

if (year < 1 || year > 9999) return false
else true if leap year
else false

leap year checker:
year % 4 ==0 && year % 100 ==0;
year % 400 == 1 && year
year

TESTS passed

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

console output:

false
true
false
true
 */


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isLeapYear(2020));
    }


    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        }

        //step 1
        else if (year % 4 !=0){
            return false;
        }
        //step 2
        else if ((year % 4 ==0) && (year % 100 !=0)){
            return true;
        }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                return true;
            }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 != 0)) {
                return false;
        }

        return false;

    }

//end curly of main
}
