package RichardMcEwan.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char newChar = 'C';

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
            case "february":
                System.out.println("Feb");
            default:
                System.out.println("Some other month");
        }

    }
}
