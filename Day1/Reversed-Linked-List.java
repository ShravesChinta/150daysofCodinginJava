//Recursion method

/***
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


***/




/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
     return reverseLinkedList(head);
       
    }
    
    public static ListNode reverseLinkedList(ListNode temp)
    {
        if(temp==null || temp.next==null)
        {
           return temp;
        }
        
        ListNode reversedListHead=reverseLinkedList(temp.next);
        temp.next.next=temp;
        temp.next=null;
        return reversedListHead;
        
        
    }
}
