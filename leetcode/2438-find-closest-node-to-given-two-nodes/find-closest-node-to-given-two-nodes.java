class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        HashMap<Integer,Integer> adj = new HashMap<>();
        for(int  i = 0 ; i < n ; i++)
        {
           adj.put(i , edges[i]);
        }
        int vis[] = new int[n];
        int dis[] = new int[n];
        int dis2[] = new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        Arrays.fill(dis2,Integer.MAX_VALUE);
        bfs(node1 , adj , dis,vis );
        Arrays.fill(vis,0);
        bfs(node2 , adj , dis2,vis );
       int min = -1;
       int max = Integer.MAX_VALUE;
       for(int i = 0 ; i < n ; i++)
       {
        if(dis[i]!= Integer.MAX_VALUE && dis2[i] != Integer.MAX_VALUE){
           int x = Math.max(dis[i] , dis2[i]);
           if( x < max)
           {
            max = x;
            min = i;
           }
       }
    }
        return min;
    }
   public void bfs(int ind,HashMap<Integer,Integer> adj, int d[],int vis[] )
   {
    int s = 0;
    Queue<Integer> que = new ArrayDeque<>();
    que.add(ind);
    while(!que.isEmpty())
    {
        int x = que.poll();
        if(vis[x] == 1)
        break;
        vis[x] = 1;
        d[x] = s;
        s++;
        if(adj.get(x) != -1)
        que.add(adj.get(x));
    }
   }
}