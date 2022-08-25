/***
Given an undirected graph with V vertices and E edges, check whether it contains any cycle or not. 

Example 1:

Input:  
V = 5, E = 5
adj = {{1}, {0, 2, 4}, {1, 3}, {2, 4}, {1, 3}} 
Output: 1
Explanation: 

1->2->3->4->1 is a cycle.
Example 2:

Input: 
V = 4, E = 2
adj = {{}, {2}, {1, 3}, {2}}
Output: 0
Explanation: 

No cycle in the graph.
 
***/
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
       Boolean[] visited=new Boolean[V];
        for(int i=0;i<V;i++)
        {
            visited[i]=false;
        }
        
        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            if(detectCycle(i,visited, -1, adj))
            return true;
        }
        return false;
    }
    
    public boolean detectCycle(int node, Boolean[] visited, int parent, ArrayList<ArrayList<Integer>> adj)
    {
        visited[node]=true;
        int num;
        for(int i:adj.get(node))
        {
            if(!visited[i])
            {
                if(detectCycle(i, visited, node, adj))
                return true;
            }
            
            else if(i!=parent)
            return true;
        }
        return false;
    }
}
