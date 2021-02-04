import java.util.Scanner;
//ARRAYS + BASIC INPUT/OUTPUT + CONDITIONALS + LOOPS

public class Hello {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
      /*  boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("adyxoni's final score was " + highScore);

        int playerPosition = calculateHighScorePosition(highScore);

        displayHighScorePosition("adyxoni", playerPosition);

        System.out.println();

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("ajloni's final score was " + highScore);

        playerPosition = calculateHighScorePosition(highScore);

        displayHighScorePosition("ajloni", playerPosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore;
        finalScore = score + (levelCompleted * bonus);
        finalScore += 2000;
        return finalScore;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into " + position + ". place");
    }

    public static int calculateHighScorePosition(int score){
        int position;
        if(score > 1000){
            position = 1;
        } else if(score > 500 && score < 1000) {
            position = 2;
        } else if(score > 100 && score < 500){
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }*/

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        double[] myDoubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1};
        System.out.println(myIntArray[5]);
        System.out.println(myDoubleArray[7]);
        for(int i=0 ; i<myDoubleArray.length ; i++){
            System.out.println(myDoubleArray[i]);
        }

        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}
