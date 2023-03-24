package GraphInJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectionUsingKahnAlgo {
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

        System.out.println(isCyclic(V,adj));
    }
    public static void addEdgeDirectedGraph(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
    }
    public static boolean isCyclic(int V,ArrayList<ArrayList<Integer>>adj){
        Queue<Integer> q = new LinkedList<>();
        int[]degree = new int[V];
        int count = 0;
        for (int i = 0; i < V; i++) {
            for(int e : adj.get(i)){
                degree[e]++;
            }
        }

        for (int i = 0; i < V; i++) {
            if(degree[i] == 0){
                q.offer(i);
            }
        }

        while (!q.isEmpty()){
            int node = q.peek();
            q.remove();
            count++;

            for (int e: adj.get(node)) {
                degree[e]--;
                if(degree[e] == 0){
                    q.offer(e);
                }
            }
        }
        System.out.println(count);
        return count == V;
    }

}
