public class GameOfLifeRule implements ICellSurvivalRule {

    @Override
    public boolean willCellSurvive(int i, int j, int[][] cells) {
        int numberOfAliveNeighbours = 0;

        if (i > 0 & j > 0 && cells[i - 1][j - 1] == 1) {
            numberOfAliveNeighbours++;
        }

        if (i > 0 && cells[i - 1][j] == 1) {
            numberOfAliveNeighbours++;
        }

        if (i > 0 & j < cells[0].length - 1 && cells[i - 1][j + 1] == 1) {
            numberOfAliveNeighbours++;
        }

        if (j < cells[0].length - 1 && cells[i][j + 1] == 1) {
            numberOfAliveNeighbours++;
        }

        if (i < cells.length - 1 & j < cells[0].length - 1 && cells[i + 1][j + 1] == 1) {
            numberOfAliveNeighbours++;
        }

        if (i < cells.length - 1 && cells[i + 1][j] == 1) {
            numberOfAliveNeighbours++;
        }

        if (i < cells.length - 1 & j > 0 && cells[i + 1][j - 1] == 1) {
            numberOfAliveNeighbours++;
        }

        if (j > 0 && cells[i][j - 1] == 1) {
            numberOfAliveNeighbours++;
        }
        return numberOfAliveNeighbours == 2 & cells[i][j] == 1 || numberOfAliveNeighbours == 3;
    }
}
