package GraphInJava;

//https://practice.geeksforgeeks.org/problems/distance-from-the-source-bellman-ford-algorithm/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=distance-from-the-source-bellman-ford-algorithm
import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFordAlgo {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>>edge = new ArrayList<>();
        int S = 0;
        int V = 5;
        System.out.println(Arrays.toString(bellmanFord(edge,V,S)));
    }
    /*
    BellmanFord algo is used to find the shortest path form source node to all other nodes,which is same as Dijkstra
    But Dijkstra is not applicable for negative edge weights as well as negative cycle,But BellmanFord is
    applicable for both negative cycle as well and negative edge wt,but bellmanFord is not applicable for
    Undirected graph. For applicable for undirected graph ,we need to convert it into Directed Graph.
     */
    public static int[] bellmanFord(ArrayList<ArrayList<Integer>>edge, int V, int S){

        int[]dist = new int[V];
        Arrays.fill(dist,(int)1e8);
        dist[S] = 0;

        for (int i = 0; i < V-1; i++) {
            for(ArrayList<Integer>list : edge){
                int u = list.get(0);
                int v = list.get(1);
                int wt = list.get(2);

                if (dist[u] + wt < dist[v]){
                    dist[v] = dist[u] + wt;
                }
            }
        }

        for (ArrayList<Integer>list: edge) {
            int u = list.get(0);
            int v = list.get(1);
            int wt = list.get(2);

            if (dist[u] + wt < dist[v]){
                int[]temp = new int[]{-1};
                return temp;
            }
        }
        return dist;
    }
}
