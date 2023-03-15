package GraphInJava;
/*  https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1?utm_source=youtube&utm
    _medium=collab_striver_ytdescription&utm_campaign=detect-cycle-in-a-directed-graph
 */
import java.util.ArrayList;

public class CycleDetectionInDirectedGraphUsingDFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int V = 10;
        for (int i = 0; i <= V ; i++) {
            adj.add(new ArrayList<>());
        }
        addEdgeInDirectedGraph(adj,1,2);
        addEdgeInDirectedGraph(adj,2,3);
        addEdgeInDirectedGraph(adj,3,4);
        addEdgeInDirectedGraph(adj,3,7);
        addEdgeInDirectedGraph(adj,4,5);
        addEdgeInDirectedGraph(adj,5,6);
        addEdgeInDirectedGraph(adj,8,2);
        addEdgeInDirectedGraph(adj,8,9);
        addEdgeInDirectedGraph(adj,9,10);
        addEdgeInDirectedGraph(adj,10,8);
        System.out.println(adj);

        System.out.println(isCycle(adj,V));
        System.out.println(isCycle2(adj,V));
    }

    public static void addEdgeInDirectedGraph(ArrayList<ArrayList<Integer>>adj,int u, int v){
        adj.get(u).add(v);
    }
    public static boolean isCycle2(ArrayList<ArrayList<Integer>>adj,int V){
        int[] vis = new int[V+1];
        for (int i = 1; i <= V ; i++) {
            if(vis[i] == 0){
                if(isCheck2(adj,i,vis)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCheck2(ArrayList<ArrayList<Integer>>adj,int node,int[] vis){

        vis[node] = 2;

        for(int el : adj.get(node)){
            if(vis[el] == 0){
                if(isCheck2(adj,el,vis))
                    return true;
            }
            else if(vis[el] == 2){
                return true;
            }
        }
        vis[node] = 1;
        return false;
    }

    public static boolean isCycle(ArrayList<ArrayList<Integer>>adj,int V){

        boolean[] vis = new boolean[V+1];
        boolean[] visPath = new boolean[V+1];

        for (int i = 1; i <= V ; i++) {
            if(!vis[i]){
                if(isCheck(adj,i,visPath,vis)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCheck(ArrayList<ArrayList<Integer>>adj,int node,boolean[]visPath,boolean[]vis){

        vis[node] = true;
        visPath[node] = true;

        for (int it : adj.get(node)) {
            if(!vis[it]){
                if(isCheck(adj,it,visPath,vis)){
                    return true;
                }
            }
            else if(visPath[it]){
                return true;
            }
        }
        visPath[node] = false;
        return false;
    }
}
