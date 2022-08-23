/**
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 

Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

***/

class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix==null || matrix.length==0)
            return;
        
        Queue<int[]> q=new LinkedList<>();
        int row=matrix.length;
        int column=matrix[0].length;
        
        for(int i=0;i<row;i++)
        {
         for(int j=0;j<column;j++)
         {
             if(matrix[i][j]==0)
                 q.add(new int[]{i,j});
         }
        }
        
        while(q.size()>0)
        {
            int[] indexes=q.remove();
            int row1=indexes[0];
            int col1=indexes[1];
            setZero(row1,matrix,column,0);
            setZero(col1,matrix,row,1);
        }
    }
    
    public static void setZero(int index, int[][] matrix, int length, int indicator)
    {
        if(indicator==0)
        {
            for(int a=0;a<length;a++)
            {
             matrix[index][a]=0;   
            }
        }
        
        else{
            for(int a=0;a<length;a++)
            {
                matrix[a][index]=0;   
            }
        }
    }
}
