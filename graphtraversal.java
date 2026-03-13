package Practice;

import java.util.LinkedList;
import java.util.Queue;

class Graph{
    /*graph class with no of vertices, adjacency list */
    private int vertices;
    private LinkedList<Integer>[] adj;
    /*graph constructor */
    Graph(int v){
        vertices=v;
        adj=new LinkedList[v];
        /*linklist for each vertices */
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<>();
        }
    }
    /*it help for q.addedge(0,1) */
    void addedge(int v, int w){
    adj[v].add(w);
    }

    void bfs(int start){
        boolean[] visited=new boolean[vertices];
        Queue<Integer> q=new LinkedList<>();
        visited[start]=true;
        q.add(start);
        /*conthinue until queue is empty */
        while (!q.isEmpty()) {
            int node=q.poll();
            System.out.println(node + "");
            /*traverse the neighbor */
            for(int neighbor : adj[node]){
                /*unvisited neighbor */
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    q.add(neighbor);
                }
            }
        }
    }

    void dfs(int start){
        boolean[] visited=new boolean[vertices];
        dfshelper(start,visited);
    }

    void dfshelper(int node, boolean[] visited){
        visited[node]=true;
        System.out.println(node + "");
        for(int neighbor : adj[node]){
            if(!visited[neighbor]){
                dfshelper(neighbor, visited);
            }
        }
    }
} 
public class graphtraversal {
   public static void main(String[] args) {
    Graph g = new Graph(4);

    g.addedge(0, 1);
    g.addedge(0, 2);
    g.addedge(1, 3);
    g.addedge(2, 3);

    System.out.println("BFS");
    g.bfs(0);
    System.out.println("DFS");
    g.dfs(0);

   }
}
