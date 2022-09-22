class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        if(head==null)
            return;
        Boolean cycle=false;
        Node fast=head, slow=head;
        while(fast!=null && fast.next!=null)
        {
           fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
            {
                cycle=true;
                break;
            }
        }
        
        if(cycle)
        {
            fast=head;
         while(fast!=slow)
         {
             fast=fast.next;
             slow=slow.next;
         }
         
         while(fast.next!=slow)
         {
             fast=fast.next;
         }
             fast.next=null;
        
        }
    }
}

