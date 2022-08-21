/***
Given an array, print the Next Smaller Element (NSE) for every element. The NSE for an element x is the first smaller element on the right side of x in array. Elements for which no smaller element exist (on right side), consider NSE as -1. 
Examples: 
a) For any array, rightmost element always has NSE as -1. 
b) For an array which is sorted in increasing order, all elements have NSE as -1. 
c) For the input array [4, 8, 5, 2, 25}, the NSE for each element are as follows.

Element         NSE
   4      -->    2
   8      -->    5
   5      -->    2
   2      -->   -1
   25     -->   -1
   
***/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int[] array={4, 8, 5, 2, 25};
		int[] result=new int[array.length];
		HashMap<Integer, Integer> map=new HashMap<>();
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<array.length;i++)
		{
		    while(stack.isEmpty()==false && stack.peek()>array[i])
		    {
		        map.put(stack.pop(), array[i]);

		    }
		    stack.push(array[i]);
		}
		
		for(int i=0;i<array.length;i++)
		{
		    int num=map.getOrDefault(array[i],-1);
		    System.out.println(array[i] + " -> " + num);
		}
		
		
	}	
}


/***
output

4 -> 2
8 -> 5
5 -> 2
2 -> -1
25 -> -1

***/
