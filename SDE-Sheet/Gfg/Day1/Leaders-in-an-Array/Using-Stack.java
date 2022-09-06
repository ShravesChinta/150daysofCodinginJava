
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
    ArrayList<Integer> result=new ArrayList<>();
    Stack<Integer>s =new Stack<>();
    int max=arr[arr.length-1];
    for(int i=arr.length-1;i>=0;i--)
    {
        
        if(arr[i]>=max)
        {
            s.push(arr[i]);
            max=arr[i];
        }
    }
    while(s.size()>0)
    {
        result.add(s.pop());
    }
    return result;
    }
}
