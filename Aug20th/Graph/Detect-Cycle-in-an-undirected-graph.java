import java.io.*;
import java.util.*;

class Graph
{
    int V;
    LinkedList<Integer> adj[];
    Graph(int v)
    {
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList();
        }
    }
    
    
   public void addEdges(int v, int w)
   {
       adj[v].add(w);
       adj[w].add(v);
   }
   Boolean isCyclicUtil(int v, Boolean visited[], int parent)
   {
       visited[v]=true;
       int num;
       
       for(int i:adj[v])
       {
           if(!visited[i])
           {
               if(isCyclicUtil(i,visited, v))
               return true;
               
           }
          else if(i!=parent)
          return true;
          
        
       }
       
       return false;
   }
   
   Boolean isCyclic()
   {
       Boolean visited[]=new Boolean[V];
       for(int i=0;i<V;i++)
       {
           visited[i]=false;
       }
       for(int i=0;i<V;i++)
       {
           if(!visited[i])
           if(isCyclicUtil(i, visited, -1))
           return true;
           
       }
       
       return false;
   }
    

    
}
public class Main
{
	public static void main(String[] args) {
		Graph g1 =new Graph(5);
		g1.addEdges(1,0);
		g1.addEdges(0,2);
		g1.addEdges(2,1);
		g1.addEdges(0,3);
		g1.addEdges(3,4);
		if(g1.isCyclic())
		{
		    System.out.println("Graph contains cycle");
		}
		else{
		    System.out.println("Graph does'nt contains cycle");
		}
		
		
		Graph g2 =new Graph(3);
		g2.addEdges(0,1);
		g2.addEdges(1,2);
		if(g2.isCyclic())
		{
		    System.out.println("Graph contains cycle");
		}
		else{
		    System.out.println("Graph does'nt contains cycle");
		}
		
	}
	

    
}
