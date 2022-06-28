

class Solution {
    public int fib(int n) {
        int m=n;
        int[] array1=new int[m+1];
        return fibMemoization(m,array1);
    }
    
    public static int fibMemoization(int n,int[] array1)
    {
        if(n<=1)
        {
            array1[n]=n;
            return array1[n];
        }
        
        else if(array1[n]==0)
        {    
          array1[n]=fibMemoization(n-1, array1)+fibMemoization(n-2, array1);
        }
        
        return array1[n];
    }
}
