/***
Find the n’th Node from the end of a given Linked List
September 12, 2014 by Sumit Jain
Objective: Given a linked list and integer ‘n’, write an algorithm to find the nth node from the end in the Linked List.

Example:

Original List : ->1->2->8->3->7->0->4
Output : 3rd Element from the end is : 7


***/

class Node{
    int data;
    Node next;
    Node(){
        this.data=0;
        this.next=null;
    }
    
}

class LinkedList{
    Node root;
    public void insertAtBeg(int val){
    if(root.data==0)
    root=null;
    
    Node new_node=new Node();
    new_node.data=val;
    
    if(root==null)
    {
        new_node.next=null;
        root=new_node;
    }
    else
    {   
        new_node.next=root;
        root=new_node;
    }
    
}

public void display(Node root)
{
    Node temp=root;
    if(root==null)
    {
    return;
    }
    
    else{

        while(temp!=null)
        {
            //System.out.println("hello");
            System.out.print(temp.data+" - >");
            temp=temp.next;
        }
        System.out.println(" ");
    }
}

public void reversePrint(Node root,int[] n){
    if(root==null)
    return;
    
    reversePrint(root.next,n);
    
    if(--n[0]==0){
    System.out.println(root.data);
    }
}

}

public class Main
{
	public static void main(String[] args) {
	LinkedList l=new LinkedList();
		l.root=new Node();
		l.insertAtBeg(1);
		l.insertAtBeg(2);
		l.insertAtBeg(2);
		l.insertAtBeg(3);
		l.insertAtBeg(4);
		l.insertAtBeg(5);
		l.insertAtBeg(8);
		l.insertAtBeg(8);
		l.insertAtBeg(8);
		System.out.println("Linked List display");
		l.display(l.root);
		//System.out.println("The nth from last is ");
		System.out.println("Linked List  reverse display");
		int[] m=new int[1];
		m[0]=4;
		l.reversePrint(l.root,m);
	}
}
