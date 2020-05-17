public class Grid {

    int[][] cells;

    public Grid(int[][] cells) {
        if (cells == null) {
            throw new IllegalArgumentException();
        }
        this.cells = cells;
    }

    public int[][] getCurrentState() {
        return cells;
    }

    public void changeState(GameOfLifeRule rule) {

        int[][] result = new int[cells.length][cells[0].length];

        for (int i = 0; i < cells.length; i++) {

            for (int j = 0; j < cells[0].length; j++) {
                result[i][j] = rule.willCellSurvive(i, j, cells) ? 1 : 0;
            }
        }
        cells = result;
    }
}
