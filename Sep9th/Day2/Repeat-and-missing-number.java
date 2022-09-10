/***
Problem Statement: You are given a read-only array of N integers with values also in the range [1, N] both inclusive. Each integer appears exactly once except A which appears twice and B which is missing. The task is to find the repeating and missing numbers A and B where A repeats twice and B is missing.

Example 1:

Input Format:  array[] = {3,1,2,5,3}

Result: {3,4)

Explanation: A = 3 , B = 4 
Since 3 is appearing twice and 4 is missing
Example 2:

Input Format: array[] = {3,1,2,5,4,6,7,5}

Result: {5,8)

Explanation: A = 5 , B = 8 
Since 5 is appearing twice and 8 is missing

***/
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int xor1=arr.get(0);
        Integer first_bit;
        int x=0;
        int y=0;
        for(int i=1;i<arr.size();i++)
        {
            xor1=xor1^arr.get(i);
        }
        
        for(int i=1;i<=n;i++)
        {
            xor1=xor1^i;
        }
       first_bit=xor1&~(xor1-1);
       for(int i=0;i<arr.size();i++)
       {
           if((arr.get(i) & first_bit) !=0)
               x=x^arr.get(i);
           
           else
               y=y^arr.get(i);
       }
        
        for(int i=1;i<=n;i++)
        {
            if((i & first_bit)!=0)
                x=x^i;
            
            else
                y=y^i;
        }
        
        if(arr.contains(x))
            return new int[]{y,x};
        
         return new int[]{x,y};
    }
}


// solved in Ninja coding platform 
