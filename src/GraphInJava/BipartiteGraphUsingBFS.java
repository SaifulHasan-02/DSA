package GraphInJava;

/* https://practice.geeksforgeeks.org/problems/bipartite-graph/1?utm_source=youtube&utm
_medium=collab_striver_ytdescription&utm_campaign=bipartite-graph
 */

import java.util.*;

public class BipartiteGraphUsingBFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int V = 9;
        for (int i = 0; i < V; i++) {
            list.add(new ArrayList<>());
        }
        addEdge(list,0,1);
        addEdge(list,0,4);
        addEdge(list,1,3);
        addEdge(list,1,4);
        addEdge(list,2,1);
        addEdge(list,2,3);
        addEdge(list,3,4);
        addEdge(list,5,6);
        addEdge(list,7,8);

//        System.out.println(list);

        System.out.println(bfs(list,V));
    }
    public static void addEdge(ArrayList<ArrayList<Integer>>adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static boolean bfs(ArrayList<ArrayList<Integer>>adj,int V){
        int[]color = new int[V];
        Arrays.fill(color,-1);

        for (int i = 0; i < V; i++) {
            if(color[i] == -1){
                if(!isBipartiteGraph(i, adj, V, color)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isBipartiteGraph(int node,ArrayList<ArrayList<Integer>>adj,int V,int[]color){

        Queue<Integer>q = new LinkedList<>();

        color[node] = 0;
        q.offer(node);

        while (!q.isEmpty()){
            int nd = q.peek();
            q.remove();

            for (Integer it: adj.get(nd)) {
                if(color[it] == -1){
                    color[it] = 1 - color[nd];
                    q.offer(it);
                }
                else if(color[it] == color[nd]){
                    return false;
                }
            }
        }
        return true;
    }
}
