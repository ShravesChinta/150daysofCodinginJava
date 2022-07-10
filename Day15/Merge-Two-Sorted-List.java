
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]

 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode new_node=new ListNode(0);
        ListNode node=new_node;
    
        if(list1==null&& list2==null)
            return list1;
    
        if(list1==null)
            return list2;
       
        if(list2==null)
            return list1;
        
         while(list1!=null && list2!=null)
         {
             if(list1.val<list2.val)
             {
                 node.next=list1;
                 list1=list1.next;
             }
             else{
                 node.next=list2;
                 list2=list2.next;
             }
             node=node.next;
         }
    
    if(list1!=null)
    {
        node.next=list1;
    }
    
    
    if(list2!=null)
    {
        node.next=list2;
    }
    
    return new_node.next;
        
    }
}
