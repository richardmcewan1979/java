package RichardMcEwan.com;

public class Main {
    private static final long MINS_IN_YEAR = 525600;
    private static final long MINS_IN_DAY = 1440;

    public static void main(String[] args) {
	// write your code here
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){

        if(minutes < 0) {
            System.out.println("Invalid Value");
        }

        else {
            //long minutes = XX;
            long years = (int) (minutes / MINS_IN_YEAR);
            long days = (minutes - (years*MINS_IN_YEAR));
            days = (int) (days / MINS_IN_DAY);

            System.out.println(minutes);
            System.out.println(years);
            System.out.println(days);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");

        }
    }

    //End of Main curly
}
