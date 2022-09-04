/***
Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100

***/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l=new ArrayList<>();
        if(matrix==null || matrix.length==0)
            return l;
        
        int rowBegin=0;
        int rowEnd=matrix.length-1;
        
        int columnBegin=0;
        int columnEnd=matrix[0].length-1;
        
        while(rowBegin<=rowEnd && columnBegin<=columnEnd)
        {
            for(int i=columnBegin;i<=columnEnd;i++)
            {
                l.add(matrix[rowBegin][i]);
            }
            
            rowBegin++;
            
            for(int i=rowBegin;i<=rowEnd;i++)
            {
                l.add(matrix[i][columnEnd]);
            }
            
            columnEnd--;
            
            
            if(rowBegin<=rowEnd)
            {
               for(int i=columnEnd;i>=columnBegin;i--)
               {
                   l.add(matrix[rowEnd][i]);
               }
            }
           rowEnd--;
            
             if(columnBegin<=columnEnd)
            {
               for(int i=rowEnd;i>=rowBegin;i--)
               {
                   l.add(matrix[i][columnBegin]);
               }
            }
            
            columnBegin++;
        }
        
        return l;
    }
}
