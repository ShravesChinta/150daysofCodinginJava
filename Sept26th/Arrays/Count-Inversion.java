//Count Inversions question solved in coding Ninja 


import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        long[] temp=new long[n];
        return merge_Sort(arr, temp, 0, n-1);
    }
    
    
    public static long merge_Sort(long[] arr, long[] temp, int start, int end)
    {
        int mid;
        long inv_count=0;
        if(start<end)
        {
            mid=start+(end-start)/2;
            inv_count+=merge_Sort(arr, temp, start, mid);
            inv_count+=merge_Sort(arr, temp, mid+1, end);
            
            inv_count+=merge(arr,temp, start, mid+1,end);
        }
        return inv_count;
    }
    
    public static long merge(long arr[], long temp[], int left, int mid, int right)
    {
        long inv_count=0;
        int i=left;
        int j=mid;
        int k=left;
        while(i<mid && j<=right)
        {
            if(arr[i]<=arr[j])
            {
             temp[k++]=arr[i++];   
            }
            else
            {
                temp[k++]=arr[j++];
                inv_count=inv_count+mid-i;
            }
        }
        
        while(i<mid)
        {
            temp[k++]=arr[i++];
        }
        
        while(j<=right)
        {
            temp[k++]=arr[j++];
        }
        
        for(i=left;i<=right;i++)
        {
            arr[i]=temp[i];
        }
        
        return inv_count;
    }
}
