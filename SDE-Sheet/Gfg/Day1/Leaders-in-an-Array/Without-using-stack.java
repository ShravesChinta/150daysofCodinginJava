

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
    ArrayList<Integer> result=new ArrayList<>();
    long max=Integer.MIN_VALUE;
    for(int i=arr.length-1;i>=0;i--)
    {
        
        if(arr[i]>=max)
        {
            result.add((int)arr[i]);
            max=arr[i];
        }
    }
    Collections.reverse(result);
    return result;
    }
}
