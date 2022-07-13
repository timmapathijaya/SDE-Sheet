class Solution {
    public void swap(int[][] matrix , int i , int j)
    {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public void reverse(int[][] matrix , int i)
    {
        int start = 0 , end = matrix[i].length - 1;
        while(start < end)
        {
            int temp = matrix[i][start];
            matrix[i][start] = matrix[i][end];
            matrix[i][end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[][] matrix) {
       // Transpose the matrix
        int n = matrix.length;
        for(int i = 0 ; i < n ; i++) // N^2
        {
            for(int j = 0 ; j < i ; j++)
                swap(matrix , i , j);
        }
        // Reverse every row
        for(int i = 0 ; i < n ; i++) // N^2
            reverse(matrix , i);
    }
}
// TC : N^2 + N^2 => O(2 * N^2)
// SC : O(1)

