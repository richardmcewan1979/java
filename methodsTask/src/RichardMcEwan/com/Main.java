package RichardMcEwan.com;

//practicing return values
//bugg as two values over 1000 will return position 1

public class Main {

    public static void main(String[] args) {
	// write your code here
    //call methods

        displayHighScore("paul", 1500);
        displayHighScore("john", 900);
        displayHighScore("ringo", 400);
        displayHighScore("george", 50);

        //end of main method
    }

    public static void displayHighScore(String playersName, int score ){
        int position = calculateHighScorePosition(score);
        System.out.println(playersName + " you scored " + score + " and reached position " +
                position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        }
        else if (playerScore >= 500) {
            position = 2;
        }
        else if (playerScore >= 100) {
            position = 3;
        }

    return position;
    }
    //end of class
}
