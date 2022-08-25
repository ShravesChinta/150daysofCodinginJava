//solved in geeks for geeks

class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
       Stack<Integer> s=new Stack<Integer>();
       int vis[]=new int[V];
       for(int i=0;i<V;i++)
       {
           if(vis[i]==0)
           TopoSort(i, vis, adj, s);
       }
       
       int topo[]=new int[V];
       int index=0;
       while(!s.isEmpty())
       {
           topo[index++]=s.pop();
       }
       
       return topo;
    }
    
    public static void TopoSort(int node, int[] visited, ArrayList<ArrayList<Integer>> adj, Stack<Integer> s)
    {
        visited[node]=1;
        for(int i=0;i<adj.get(node).size();i++)
        {
            if(visited[adj.get(node).get(i)]==0)
            TopoSort(adj.get(node).get(i), visited, adj, s);
        }
        
        s.push(node);
    }
}
