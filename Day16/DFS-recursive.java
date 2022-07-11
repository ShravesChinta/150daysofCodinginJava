/**Code to get DFS in recursive way

***/

import java.util.*;

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
   
    public void DFS(Node root,ArrayList<Integer> a)
    {
        if(root==null)
        return;
        if(!a.contains(root.data))
        a.add(root.data);
        
        DFS(root.left,a);
        DFS(root.right,a);
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
	    Tree t=new Tree();
		t.root=new Node(20);
		t.root.left=new Node(39);
		t.root.right=new Node(4);
		t.root.left.left=new Node(10);
		t.root.left.right=new Node(45);
		t.root.right.left=new Node(88);
		t.root.right.right=new Node(100);
		ArrayList<Integer> a=new ArrayList<>();
		t.DFS(t.root,a);
		System.out.println(a);
	}
}
