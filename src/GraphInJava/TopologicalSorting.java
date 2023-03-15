package GraphInJava;

//https://practice.geeksforgeeks.org/problems/topological-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=topological-sort

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class TopologicalSorting {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        int V = 6;

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdgeDirectedGraph(adj,2,3);
        addEdgeDirectedGraph(adj,3,1);
        addEdgeDirectedGraph(adj,4,0);
        addEdgeDirectedGraph(adj,4,1);
        addEdgeDirectedGraph(adj,5,0);
        addEdgeDirectedGraph(adj,5,2);
        System.out.println(adj);

        System.out.println(Arrays.toString(topologicalSorting(adj,V)));
    }
    public static void addEdgeDirectedGraph(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
    }
    public static int[] topologicalSorting(ArrayList<ArrayList<Integer>>adj,int V){
        Stack<Integer> stk = new Stack<>();

        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if(!vis[i]){
                dfs(adj,i,vis,stk);
            }
        }
        int[] ans = new int[stk.size()];
        int ind = 0;
        while (!stk.isEmpty()){
            ans[ind++] = stk.peek();
            stk.pop();
        }
        return ans;

    }
    public static void dfs(ArrayList<ArrayList<Integer>>adj,int node,boolean[]vis,Stack<Integer>s){
        vis[node] = true;

        for (int e:adj.get(node)) {
            if(!vis[e]){
                dfs(adj,e,vis,s);
            }
        }
        s.push(node);
    }
}
