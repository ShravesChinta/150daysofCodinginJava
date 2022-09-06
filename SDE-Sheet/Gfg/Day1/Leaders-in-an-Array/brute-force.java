/***
Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
 

Example 2:

Input:
n = 5
A[] = {1,2,3,4,0}
Output: 4 0
 

Your Task:
You don't need to read input or print anything. The task is to complete the function leader() which takes array A and n as input parameters and returns an array of leaders in order of their appearance.

 

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

 


**/
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
    ArrayList<Integer> result=new ArrayList<>();
    boolean leader=false;
    for(int i=0;i<arr.length-1;i++)
    {
     int num=arr[i];
     //System.out.println(num);
     leader=false;
     for(int j=i+1;j<arr.length;j++)
     {
         if(!(num>=arr[j]))
         {
             //System.out.println("hey " + num + " " +arr[j]);
             leader=false;
            break;   
         }
         leader=true;
     }
     //System.out.println(leader + " " + num);
     if(leader)
     {
         result.add(num);
     }
    } 
     result.add(arr[arr.length-1]);
    return result;
    }
}
