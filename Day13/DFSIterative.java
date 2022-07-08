
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
    Stack<Node> s=new Stack<>();
    ArrayList<Integer> visited=new ArrayList<>();
    public void DFSIterative()
    {
        s.push(root);
        while(s.size()!=0)
        {
            Node relement=s.pop(); 
           visited.add(relement.data);
           
           if(relement.right!=null)
           s.push(relement.right);
           
           if(relement.left!=null)
           s.push(relement.left);
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
		System.out.println("DFS of the tree");
		t.DFSIterative();
		
	}
}

/**
Here the time complexity is O(n)

output:
DFS of the tree
0->1->3->7->8->4->9->10->2->5->11->6->

***/
