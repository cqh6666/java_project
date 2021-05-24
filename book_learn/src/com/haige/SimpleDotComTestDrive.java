package book_learn.src.com.haige;

import java.util.Random;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDogCom dot = new SimpleDogCom();
        int randomLocation = (int) (Math.random() * 5);
        int[] locations = {randomLocation, randomLocation+1, randomLocation+2};
        dot.setLocationCells(locations);

        boolean isLive = true;

        while(isLive){
            String guess = helper.getUserInput("enter a number:");
            String result = dot.checkYourself(guess);
            numOfGuesses++;

            if ("kill".equals(result)){
                isLive = false;
                System.out.println("Done! You took " + numOfGuesses + " guessess");
            }
        }

    }
}
