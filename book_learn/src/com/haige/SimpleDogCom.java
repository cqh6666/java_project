package book_learn.src.com.haige;

public class SimpleDogCom {

    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        for (int cell : locationCells) {
            if (cell == guess) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            return "kill";
        }
        System.out.println(result);
        return result;
    }

}

