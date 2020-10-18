package RichardMcEwan.com;

/*
Run tests with each change to avoid bugs
Read brief properly I missed a required specification

 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(2, 2018));
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


    public static int getDaysInMonth(int month, int year){

        if (month > 12 || month < 1){
            return -1;
        }

        else if(year < 1 || year > 9999){
            return -1;
        }

        else if (isLeapYear(year) == false){
            return 28;
        }


            switch(month){
                case 1:
                    return 31;
                case 2:
                    return 29;
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
            }
        return -1;

    }


    //end of main curly
}
