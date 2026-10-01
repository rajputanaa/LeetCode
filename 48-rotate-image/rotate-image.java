class Solution {
    public void rotate(int[][] matrix) {

    int n = matrix.length;
    int[][] res = new int[n][n];

    for(int i=0; i<n; i++){
    int k=0;
        for(int j=n-1; j>=0; j--){
            res[i][k] = matrix[j][i];
            k++;
        }
    }
    for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = res[i][j];
            }
        }

    }
}