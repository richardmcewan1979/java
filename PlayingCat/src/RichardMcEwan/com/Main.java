package RichardMcEwan.com;

/*
method: isCatPlaying
public static bool
parameters; bool summer; int temperature.
control:
return true if temp 25-35 inclusive;
or
return true if summer and (temp >=25 && temp <=45)

 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean tempCheck = (temperature >= 25) && (temperature <= 35);
        boolean summerCheck = (temperature >= 25) && (temperature <= 45) && summer;
        return tempCheck || summerCheck;

    }
}
