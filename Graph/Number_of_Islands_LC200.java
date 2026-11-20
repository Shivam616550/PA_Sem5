package Graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class Number_of_Islands_LC200 {
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] != '1') continue;
                islands++;
                Queue<int[]> queue = new ArrayDeque<>();
                queue.offer(new int[]{row, col});
                grid[row][col] = '0';
                while (!queue.isEmpty()) {
                    int[] cell = queue.poll();
                    for (int[] direction : directions) {
                        int nextRow = cell[0] + direction[0];
                        int nextCol = cell[1] + direction[1];
                        if (nextRow >= 0 && nextRow < rows && nextCol >= 0 && nextCol < cols
                                && grid[nextRow][nextCol] == '1') {
                            grid[nextRow][nextCol] = '0';
                            queue.offer(new int[]{nextRow, nextCol});
                        }
                    }
                }
            }
        }
        return islands;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(numIslands(grid));
    }
}
