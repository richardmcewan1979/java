package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2; // 1 + 2 = 3
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult);
        System.out.println(result);
        result = result * 10;
        result = result / 5;
        System.out.println("20 / 5 = " + result);
        result = result % 3;
        System.out.println("4 % 3 = " + result);

        //result = result +1
        result++;
        System.out.println("1+1 = " + result);
        result--;
        System.out.println("2-1 =" + result);
        result +=2; //adds 2 to last
        System.out.println("added 2 to get " + result);

        //result = result *10
        result *=10;
        System.out.println(result);



    }
}
