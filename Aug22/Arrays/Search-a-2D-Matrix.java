/***
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
***/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int column=matrix[0].length;
        
        for(int i=0;i<row;i++)
        {
            if(matrix[i][0]<=target && target<=matrix[i][column-1])
            {
                for(int j=0;j<column;j++)
                {
                    if(matrix[i][j]==target)
                        return true;
                    
                    else if(matrix[i][j]>target)
                        break;
                }
            }
            
        }
        return false;
        
    }
}
