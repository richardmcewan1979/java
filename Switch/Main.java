package RichardMcEwan.com;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printDayOfTheWeek(1);

        char newChar = 'D';

        switch (newChar){
            case 'A':
                System.out.println("Character was A");
                break;
            case 'B':
                System.out.println("Character was B");
                break;
            case 'C':
                System.out.println("Character was C");
                break;
            case 'D':
                System.out.println("Character was D");
                break;
            case 'E':
                System.out.println("Character was E");
                break;
            default:
                System.out.println("Was not A,B,C,D or E");
        }

        String month = "january";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Some other month");
                break;
        }


    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
