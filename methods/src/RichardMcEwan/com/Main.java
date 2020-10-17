package RichardMcEwan.com;


public class Main {

    public static void main(String[] args) {

        //need to view the method to see guts
        System.out.println("The highscore is " + calculateScore(true, 800, 5, 100) );

        //alternatively
        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 8;
        int bonus = 200;

        int otherHighScore = calculateScore(gameOver, score, levelCompleted, bonus );
        System.out.println("Your final score is: " + otherHighScore);

        //alternatively
        int highScore = calculateScore(true, 43, 50, 12);
        System.out.println("Your next final score is: " + highScore);

        //end of method
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted)*bonus;
            finalScore +=1000;
            return finalScore;
        } else
            {return -1;}
    }

}
