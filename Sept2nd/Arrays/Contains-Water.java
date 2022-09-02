/***
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1

**/

class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0)
            return 0;
        
       
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       int i=0;
       int j=height.length-1;
       while(i<j)
       {
           min=Math.min(height[i], height[j]);
           max=Math.max(max, min*(j-i));
           if(height[i]<height[j])
           {
               i++;
           }
           else{
               j--;
           }
       }
        
        return max;
        
    }
}
