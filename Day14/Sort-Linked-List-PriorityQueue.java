
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 Given the head of a linked list, return the list after sorting it in ascending order.

 ***Note that the solution is not optimised here. The time complexity if higher in this solution***

Example 1:


Input: head = [4,2,1,3]
Output: [1,2,3,4]
Example 2:


Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]
Example 3:

Input: head = []
Output: []

 */
class Solution {
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ListNode temp=head;
        if(head==null || head.next==null)
            return head;
        
        while(temp!=null)
        {
            pq.add(temp.val);
            temp=temp.next;
        }
        
        temp=head;
        while(temp!=null)
        {
            temp.val=pq.remove();
            temp=temp.next;
        }
        
        return head;
    }
      
}
