import java.util.*;
import java.io.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class Tree{
    Node root;
    Queue<Node> q=new LinkedList<>();
    ArrayList<Integer> visited=new ArrayList<>();
    public void BFSIterative()
    {
        q.add(root);
        while(q.size()!=0)
        {
           Node relement=q.remove(); 
           visited.add(relement.data);
           
           if(relement.left!=null)
           q.add(relement.left);
           
           if(relement.right!=null)
           q.add(relement.right);
        }
        
        for(int a:visited)
        {
            System.out.print(a + "->");
        }
        System.out.println();
        visited.clear();
        
    }
}


public class Main
{
	public static void main(String[] args) {
		Tree t=new Tree();
		t.root=new Node(0);
		t.root.left=new Node(1);
		t.root.right=new Node(2);
		t.root.left.left=new Node(3);
		t.root.left.right=new Node(4);
		t.root.left.left.left=new Node(7);
		t.root.left.left.right=new Node(8);
		t.root.left.right.left=new Node(9);
		t.root.left.right.right=new Node(10);
		t.root.right.left=new Node(5);
		t.root.right.right=new Node(6);
		t.root.right.left.left=new Node(11);
		System.out.println("BFS of the tree");
		t.BFSIterative();
		
	}
}


/*** BFS is called as level order traversal, the time complexity is O(N).

output is :
BFS of the tree
0->1->2->3->4->5->6->7->8->9->10->11->
***/
