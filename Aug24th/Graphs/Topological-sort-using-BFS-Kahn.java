//Solved in geeks for geeks

class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
       int topo[]=new int[V];
       int indegree[]=new int[V];
       for(int i=0;i<V;i++)
       {
           for(int a:adj.get(i))
           {
               indegree[a]++;
           }
       }
       
       Queue<Integer> q=new LinkedList<>();
       for(int i=0;i<V;i++)
       {
           if(indegree[i]==0)
           q.add(i);
       }
       
      int index=0;
      while(q.size()>0)
      {
          int num=q.remove();
          topo[index++]=num;
          for(int i=0;i<adj.get(num).size();i++)
          {
              indegree[adj.get(num).get(i)]--;
              if(indegree[adj.get(num).get(i)]==0)
              q.add(adj.get(num).get(i));
          }
      }
       
       return topo;
    }

}
