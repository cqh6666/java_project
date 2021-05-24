package sudu_solve.src.com.haige;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SudoSolver sudoSolver = new SudoSolver();
        int[][] Grids = initGrids();
        sudoSolver.solve(Grids);
    }

    public static int[][] initGrids() {
        int[][] grids = {{1, 2, 0, 0, 6, 3, 5, 0, 0},
                {9, 0, 0, 0, 0, 0, 0, 3, 0}, {3, 5, 0, 0, 8, 0, 0, 4, 6},
                {7, 8, 0, 3, 9, 4, 0, 5, 0}, {4, 0, 0, 0, 7, 0, 8, 0, 3},
                {5, 1, 3, 8, 2, 6, 4, 9, 7}, {8, 3, 0, 6, 5, 2, 0, 0, 0},
                {6, 0, 5, 0, 0, 0, 3, 0, 0}, {2, 4, 0, 7, 3, 8, 0, 0, 5}};
        return grids;
    }
}
