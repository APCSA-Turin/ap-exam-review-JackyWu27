public class Data {
    public static final int MAX = 500; // THIS VALUE ADDED TO ENABLE TESTING
    private int[][] grid;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Data(int[][] g) {
        grid = g;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public int[][] getGrid() {
        return grid;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setGrid(int[][] newGrid) {
        grid = newGrid;
    }

    public void repopulate() {
for(int c = 0; c < grid.length; c++) {
	for(int d = 0; d < grid[0].length; d++) {
	int r = (int) (Math.random() * (MAX / 10)) * 10;
	while (r % 100 == 0 || r == 0) {
		r = (int) (Math.random() * (MAX / 10)) * 10;
}
	grid[c][d] = r;
}
}
    }

    public int countIncreasingCols() {
int count = 0;
for(int c = 0; c < grid[0].length; c++) {
	boolean b = true;
	for(int d = 1; d < grid.length; d++) {
if (grid[d][c] < grid[d - 1][c]) {
	b = false;
}

}
if (b) {
	count++;
}
}
	return count;
    }
}
