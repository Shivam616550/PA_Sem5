class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        int r = matrix.length;
        int c = matrix[0].length;
        int[] arr = new int[r*c];
        int v = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[v] = matrix[i][j];
                v++;
            }
        }

        Arrays.sort(arr);

        return arr[k-1];
        // int r = matrix.length;
        // int c = matrix[0].length;

        // int j = k%c;
        // int i = k/c;

        // return matrix[i-1][j];
    }
}