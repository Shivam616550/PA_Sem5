package Graph;

public class Max_Area_of_Island_LC695 {
    public static int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int maxArea = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) maxArea = Math.max(maxArea, area(grid, row, col));
            }
        }
        return maxArea;
    }

    private static int area(int[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length
                || grid[row][col] == 0) return 0;
        grid[row][col] = 0;
        return 1 + area(grid, row + 1, col) + area(grid, row - 1, col)
                + area(grid, row, col + 1) + area(grid, row, col - 1);
    }

    public static void main(String[] args) {
        int[][] grid = {{0, 0, 1, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}};
        System.out.println(maxAreaOfIsland(grid));
    }
}
