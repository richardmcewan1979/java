package RichardMcEwan.com;

/*
input seconds
input minutes seconds
output hours, minutes, seconds
return XXh YYm ZZs
two methods overloaded

getDurationString(minutes, seconds)

working so far...

*/
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getDurationString(19965, 44));
        System.out.println(getDurationString(3945L));
    }

    private static String getDurationString(long minutes, long seconds){
        if ((seconds < 0) || (seconds > 60) || (minutes < 0) ) {
            return "Invalid minutes and/ or seconds parameters";

        }

        else {
            long hours = (int) (minutes / 60);
            minutes -= (hours * 60);

            String hourString = hours + "h ";
            if(hours < 10){
                hourString = "0" + hourString;
            }

            String minutesString = minutes + "m ";
            if(minutes < 10){
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "s";
            if(seconds < 10){
                secondsString = "0" + secondsString;
            }

            return hourString + minutesString + secondsString;

        }

        }

    private static String getDurationString(long seconds){
        if (seconds < 0 )
        {
            return "Invalid seconds value";
            }

        else if (seconds < 60) {
            return getDurationString(0, seconds);
        }

        else {
            long secondsToMinutes = seconds / 60;
            long minutes = (int) (secondsToMinutes);
            long remainderSeconds = seconds - (minutes*60);
            return getDurationString(minutes, remainderSeconds);

        }
    }

    //end of Main curly
}

