/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 Given the head of a singly linked list, reverse the list, and return the reversed list.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []

 */

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    ListNode temp=head;
     if(head==null || head.next==null)
         return head;
    while(temp.next!=null)
    {
        if(temp.val==temp.next.val)
        {
            temp.next=temp.next.next;
        }
        else
        {
            temp=temp.next;
        }
    }
    return head;
    }
}
