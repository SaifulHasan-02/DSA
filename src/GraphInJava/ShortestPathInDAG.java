package GraphInJava;
/*
    https://practice.geeksforgeeks.org/problems/
    shortest-path-in-undirected-graph/1?page=1&sortBy=submissions&searchQuery=graph
 */
import java.util.ArrayList;
import java.util.Stack;

public class ShortestPathInDAG {
    public static void main(String[] args) {

    }

    public int[] shortesPath(int n,int m,int[][]edges){

        ArrayList<ArrayList<Node>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Node>temp = new ArrayList<>();
            adj.add(temp);
        }
        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new Node(v,wt));
        }

        Stack<Integer>s = new Stack<>();
        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {
            if(!vis[i]){
                topoSort(adj,i,vis,s);
            }
        }
        int[]dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = (int)(1e9);
        }
        dist[0] = 0;

        while (!s.isEmpty()){
            int node = s.peek();
            s.pop();

            for (int i = 0; i < adj.get(node).size(); i++) {
                int v = adj.get(node).get(i).first;
                int wt = adj.get(node).get(i).second;

                if(dist[node]+wt<dist[v]){
                    dist[v] = dist[node]+wt;
                }
            }
        }
        return dist;
    }
    public static void topoSort(ArrayList<ArrayList<Node>> adj,int node,boolean[]vis,Stack<Integer>s){
        
        vis[node] = true;
        for (int i = 0; i < adj.get(node).size(); i++) {
            int v = adj.get(node).get(i).first;
            if(!vis[v]){
                topoSort(adj,v,vis,s);
            }
        }
        s.push(node);
    }
}
