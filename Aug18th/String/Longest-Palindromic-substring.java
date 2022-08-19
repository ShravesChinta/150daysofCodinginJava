/***
Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"

***/

class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1)
            return "";
        int start =0;
        int end=0;
        for(int i=0;i<s.length();i++)
        {
            int len1=expandFromMiddle(s, i, i);// here it handles condition like racecar where it will start checking itself in the middle then the other characters.
            int len2=expandFromMiddle(s, i, i+1);// this will handle the case where the length of the string is even. 
            int len=Math.max(len1, len2);
            //since here we dont know which case will occur , ie, when string is odd length or string is even length;
            
            if(len>end-start)
            {
                start =i-((len-1)/2);//for say we have racecar... the i is at element e, so here to get the starting index of this palindrome
                end=i+(len/2);/// here to get the ending index of palindrome
            }
            
        }
        return s.substring(start, end+1);
    }
    //time complexity os o(n2)
    public int expandFromMiddle(String s, int left, int right)
    {
        if(s==null|| left>right)
            return 0;
        
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        
        return right-left-1;
    }
}
