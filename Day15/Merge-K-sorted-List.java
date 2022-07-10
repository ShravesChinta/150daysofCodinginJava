
/**Two methods will be written here **/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

 

Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
Example 2:

Input: lists = []
Output: []
Example 3:

Input: lists = [[]]
Output: []

 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        if(lists.length==0)
            return null;
        
        for(int i=0;i<lists.length;i++)
        {
            ListNode head=lists[i];
            while(head!=null)
            {
                pq.add(head.val);
                head=head.next;
            }
        }
        
        ListNode new_head=new ListNode(0);
        ListNode tail=new_head;
        while(pq.size()>0)
        {
            ListNode new_node=new ListNode(pq.remove());
            tail.next=new_node;
            tail=tail.next;
        }
        
        return new_head.next;
        
    }
}


/****SECOND METHOD *******************************/

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
      PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        
    for(ListNode head:lists)
        while(head!=null)
        {
            minHeap.add(head.val);
            head=head.next;
        }
        
    ListNode head=new ListNode();
    ListNode temp=head;
    while(!minHeap.isEmpty()){
        temp.next=new ListNode(minHeap.remove());
        temp=temp.next;
    }
        return head.next;
    }
}
