package GraphInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class KahnAlgoTopoUsingBFS {
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

        System.out.println(Arrays.toString(topoUsingBfs(adj,V)));
    }
    public static void addEdgeDirectedGraph(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
    }
    public static int[] topoUsingBfs(ArrayList<ArrayList<Integer>>adj,int V){

        int[] ans = new int[V];
        int ind = 0;
        int[] inDegree = new int[V];

        for (int i = 0; i < V; i++) {
            for (int e:adj.get(i)) {
                inDegree[e]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if(inDegree[i] == 0){
                q.offer(i);
            }
        }

        while (!q.isEmpty()){
            int node = q.peek();
            ans[ind++] = node;
            q.remove();

            for(int it : adj.get(node)){
                inDegree[it]--;
                if(inDegree[it] == 0){
                    q.offer(it);
                }
            }
        }

        return ans;
    }
}
