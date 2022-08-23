/***
You are given an m x n grid where each cell can have one of three values:

0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

 

Example 1:


Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
Output: 4
Example 2:

Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
Output: -1
Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
Example 3:

Input: grid = [[0,2]]
Output: 0
Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.
***/

class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0)
            return 0;
        Queue<int[]> q=new LinkedList<>();
        int row=grid.length;
        int column=grid[0].length;
        int countFresh=0;
        for(int i=0;i<row;i++)
        {
         for(int j=0;j<column;j++)
         {
             if(grid[i][j]==2)
                 q.add(new int[]{i,j});
             
             else if(grid[i][j]!=0)
                 countFresh++;
         }
        }
        
        if(countFresh==0)
            return 0;
        int countMin=0, cnt=0;
        int dx[]={0,0,1,-1};
        int dy[]={1,-1,0,0};
        int size=0;
        while(q.size()>0)
        {
         size=q.size();
         //System.out.println("hey" + size);
         cnt=+size;
         //System.out.println("hello" + cnt); 
         for(int i=0;i<size;i++)
         {
             int[] index=q.remove();
             for(int j=0;j<4;j++)
             {
                 int x=index[0]+dx[j];
                 int y=index[1]+dy[j];
                 
                 if(x<0 || y<0 || x>=row || y>=column || grid[x][y]!=1)continue;
                 grid[x][y]=2;
                 q.add(new int[]{x,y});
                 countFresh--;
             }
         }
            if(q.size()!=0)
                 countMin++;
            
        }
        //System.out.println(countMin);
         if(countFresh==0)
                return countMin;
        
        return -1;
    }
}
