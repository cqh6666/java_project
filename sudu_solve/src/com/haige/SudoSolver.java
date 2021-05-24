package sudu_solve.src.com.haige;

public class SudoSolver {

    public static final int sudoLen = 9;

    /*
    外部接口-解数独
     */
    public void solve(int[][] grids) {
        printArray(grids);
        System.out.println();

        if (this.solve(grids, 0, 0)) {
            printArray(grids);
        } else {
            System.out.println("not found!");
        }
    }

    /*
    内部接口-解数独
    huisu
     */
    private boolean solve(int[][] grids, int row, int column) {

        // stop
        if (column == 9 && row == 8) {
            return true;
        }
        //可能走到尽头
        if (column == 9) {
            column = 0;
            row++;
        }

        //不为0
        if (grids[row][column] != 0) {
            return solve(grids, row, column + 1);
        }
        //为0，写入数字
        for (int num = 1; num <= 9; num++) {
            if (isSafe(grids, row, column, num)) {
                grids[row][column] = num;
                if (solve(grids, row, column + 1)) {
                    return true;
                }
            }
        }


        grids[row][column] = 0;
        return false;
    }

    /*
    能否写入
     */
    private boolean isSafe(int[][] grids, int row, int column, int value) {
        if (isRowSafe(grids, row, value) && isColumnSafe(grids, column, value) && isSquareSafe(grids, row, column, value))
            return true;
        else
            return false;
    }

    //    判断同行
    private boolean isRowSafe(int[][] grids, int row, int value) {

        for (int i = 0; i < 9; i++) {
            if (grids[row][i] == value)
                return false;
        }
        return true;
    }

    //    判断同列
    private boolean isColumnSafe(int[][] grids, int column, int value) {

        for (int i = 0; i < 9; i++) {
            if (grids[i][column] == value)
                return false;
        }
        return true;
    }

    //    判断九宫格
    private boolean isSquareSafe(int[][] grids, int row, int column, int value) {

        int box_i = row - row % 3;
        int box_j = column - column % 3;

        for (int i = box_i; i < box_i + 3; i++) {
            for (int j = box_j; j < box_j + 3; j++) {
                if (grids[i][j] == value)
                    return false;
            }
        }
        return true;
    }


    public void printArray(int[][] grids) {

        for (int i = 0; i < sudoLen; i++) {
            if (i % 3 == 0) {
                System.out.println("----------------------");
            }
            for (int j = 0; j < sudoLen; j++) {
                if (j % 3 == 0) {
                    System.out.print("|");
                }
                System.out.print(grids[i][j] == 0 ? " " : grids[i][j]);
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println("----------------------");
    }
}
