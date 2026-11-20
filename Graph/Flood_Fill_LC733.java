package Graph;

public class Flood_Fill_LC733 {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        if (original != color) fill(image, sr, sc, original, color);
        return image;
    }

    private static void fill(int[][] image, int row, int col, int original, int color) {
        if (row < 0 || col < 0 || row >= image.length || col >= image[0].length
                || image[row][col] != original) return;
        image[row][col] = color;
        fill(image, row + 1, col, original, color);
        fill(image, row - 1, col, original, color);
        fill(image, row, col + 1, original, color);
        fill(image, row, col - 1, original, color);
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        floodFill(image, 1, 1, 2);
        for (int[] row : image) System.out.println(java.util.Arrays.toString(row));
    }
}
