import org.testng.Assert;
import org.testng.annotations.Test;

public class GridTest {

    @Test
    public void blinker() {

        test(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        }, new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        }, 1);

    }

    @Test
    public void toad() {

        test(new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        }, new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        }, 1);

    }

    @Test
    public void beacon() {

        test(new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0},
                {0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 0}
        }, new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 0}
        }, 1);

    }

    @Test
    public void pulsar() {

        test(new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        }, new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        }, 2);

    }

    @Test
    public void test0() {

        test(new int[][]{
                {1, 0},
                {0, 0}
        }, new int[][]{
                {0, 0},
                {0, 0}
        }, 1);

    }

    @Test
    public void test1() {

        test(new int[][]{
                {0, 1},
                {0, 0}
        }, new int[][]{
                {0, 0},
                {0, 0}
        }, 1);

    }

    @Test
    public void test2() {
        test(new int[][]{
                {0, 1},
                {1, 1}
        }, new int[][]{
                {1, 1},
                {1, 1}
        }, 1);

    }

    @Test
    public void test3() {

        test(new int[][]{
                {0, 0, 1},
                {1, 0, 0},
                {0, 1, 0}
        }, new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        }, 1);

    }


    @Test
    public void block() {
        test(new int[][]{
                {0, 0, 0, 0},
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0},
        }, new int[][]{
                {0, 0, 0, 0},
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0},
        }, 1);

    }

    @Test
    public void beehive() {

        test(new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0}
        }, new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0}
        }, 1);

    }

    @Test
    public void loaf() {

        test(new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0}
        }, new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0}
        }, 1);

    }

    @Test
    public void boat() {

        test(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        }, new int[][]{
                {0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        }, 1);
    }

    @Test
    public void tub() {
        test(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        }, new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        }, 1);
    }

    private void test(int[][] initial, int[][] expected, int numberOfStateChanges) {
        Grid grid = new Grid(initial);

        int count = 1;
        do {
            grid.changeState(new GameOfLifeRule());
            count++;
        } while (count <= numberOfStateChanges);
        int[][] actual = grid.getCurrentState();

        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[0].length; j++) {
                Assert.assertEquals(actual[i][j], expected[i][j]);
            }
        }
    }

}
