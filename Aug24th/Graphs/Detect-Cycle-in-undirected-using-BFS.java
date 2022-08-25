//Questions solved in geeks for geeks

public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
       Boolean[] visited=new Boolean[V];
        for(int i=0;i<V;i++)
        {
            visited[i]=false;
        }
        
        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            if(detectCycle(i,visited,adj))
            return true;
        }
        return false;
    }
    
    public boolean detectCycle(int node, Boolean[] visited, ArrayList<ArrayList<Integer>> adj)
    {
        //System.out.println(visited);
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{node, -1});
        while(q.size()>0)
        {
            int[] n_node=q.remove();
            int parent=n_node[1];
            int new_node=n_node[0];
            visited[new_node]=true;
            for(int a:adj.get(new_node))
            {
                if(!visited[a])
                q.add(new int[]{a,new_node});
                
                else if(a!=parent)
                return true;
            }
            
        }
        
        return false;
    }
}
