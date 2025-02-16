public class SatisfyCondition {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 1},
                {1, 2, 1},
                {1, 2, 1}
        };
        System.out.println(satisfiesConditions(grid)); // Expected Output: true
    }

    public static boolean satisfiesConditions(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Check row condition: No two adjacent elements in a row should be the same
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (grid[i][j] == grid[i][j + 1]) {
                    return false;
                }
            }
        }

        // Check column condition: All elements in a column should be the same
        for (int j = 0; j < n; j++) { // Iterate over columns
            int firstElement = grid[0][j]; // Reference for column comparison
            for (int i = 1; i < m; i++) {
                if (grid[i][j] != firstElement) { // Ensure column values are identical
                    return false;
                }
            }
        }

        return true;
    }
}
