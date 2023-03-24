package GraphInJava;

import java.util.ArrayList;
import java.util.Arrays;

public class BipartiteUsingDfs {
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

        System.out.println(isBipartite(list,V));
    }
    public static void addEdge(ArrayList<ArrayList<Integer>>adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static boolean isBipartite(ArrayList<ArrayList<Integer>>adj,int V){
        int[]color = new int[V];
        Arrays.fill(color,-1);

        for (int i = 0; i < V; i++) {
            if(color[i] == -1){
                if(!isDfs(i,adj,0,color)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isDfs(int node,ArrayList<ArrayList<Integer>>adj,int col,int[]color){
        color[node] = col;

        for (Integer it:adj.get(node)) {
            if(color[it] == -1){
                if(!isDfs(it,adj,1-col,color)){
                    return false;
                }
            }

        }
        return true;
    }
}
