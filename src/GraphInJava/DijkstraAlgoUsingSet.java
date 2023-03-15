package GraphInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class DijkstraAlgoUsingSet {
    public static void main(String[] args) {

    }
    public static class Node{
        int distance,node;
        Node(int distance, int node){
            this.distance = distance;
            this.node = node;
        }
    }

    public int[] dijkstra(ArrayList<ArrayList<ArrayList<Integer>>>adj, int V, int S){
        int[]dist = new int[V];
        Arrays.fill(dist,(int)1e9);
        dist[S] = 0;

        TreeSet<Node>set = new TreeSet<>();
        set.add(new Node(0,S));

        while (!set.isEmpty()){
            Node temp = set.pollFirst();
            int dis = temp.distance;
            int node = temp.node;

            for (int i = 0; i < adj.get(node).size(); i++) {
                int adjNode = adj.get(node).get(i).get(1);
                int edgeWt = adj.get(node).get(i).get(0);

                if(dis + edgeWt < dist[adjNode]){
                    if(dist[adjNode] != 1e9){

                        set.remove(dist[adjNode]);


                        dist[adjNode] = dis + edgeWt;
                        set.add(new Node(dist[adjNode],adjNode));
                    }
                }
            }
            return dist;
        }
        return dist;
    }
}
