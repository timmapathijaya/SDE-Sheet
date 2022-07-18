class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
// place ith pointer to first row & jth pointer to last column 
        int i = 0 , j = cols - 1 ;
        while(i < rows && j >= 0) // rows + cols 
        {
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] < target)
                i++;
            else if(matrix[i][j] > target)
                j--;
        }
        return false;
    }
}
// TC : O(M + N)
// SC : O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
// If we convert matrix into a linear array the elements will be in sorted order
//Let us assume we have a linear sorted array , to find target we can apply binary search
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0 , high = rows * cols - 1;
        // Applying Binary Search 
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            int row = mid / cols;
            int col = mid % cols;
            if(matrix[row][col] == target)
                return true;
            else if(matrix[row][col] < target)
                low = mid + 1;
            else if(matrix[row][col] > target)
                high = mid - 1;
        }
        return false;
    }
}
// TC : O(log(rows * cols))
// SC : O(1)
