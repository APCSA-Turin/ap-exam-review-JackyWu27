public class ArrayResizer {

    public static boolean isNonZeroRow(int[][] array2D, int r) {
for (int c = 0; c < array2D[r].length; c ++) {
		if (array2D[r][c] == 0) {
			return false;
}
}
return true;
    }

    public static int[][] resize(int[][] array2D) {
int[][] rtrn = new int[numNonZeroRows(array2D)][array2D[0].length];
int d = 0;
	for (int c = 0; c < array2D.length; c ++) {
		if (isNonZeroRow(array2D, c)) {
			rtrn[d] = array2D[c];
			d++;
}
}
return rtrn;
    }

    // CODE BELOW ADDED TO ENABLE TESTING; NOT SHOWN IN ORIGINAL FRQ
    public static int numNonZeroRows(int[][] array2D) {
        int nonZeroRowCount = 0;
        for (int row = 0; row < array2D.length; row++) {
            boolean hasZeros = false;
            for (int col = 0; col < array2D[0].length; col++) {
                if (array2D[row][col] == 0) {
                    hasZeros = true;
                }
            }
            if (!hasZeros) {
                nonZeroRowCount++;
            }
        }
        return nonZeroRowCount;
    }
}

