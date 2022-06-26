/***
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.
 
Example 1:
Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:
Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:
Input: n = 3
Output: false
***/

class Solution {
    public boolean isPowerOfTwo(int n) {
        return powerofTwo(n,2);
    }
    
    public static boolean powerofTwo(int n, int k) {
  System.out.println(n);
        if(n==0)
            return false;
     if(n==1) 
         return true;
     if(n%k!=0)
         return false;

     
     return powerofTwo(n/k,k);
