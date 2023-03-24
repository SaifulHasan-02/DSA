package GraphInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgoUsingPQ {
    public static void main(String[] args) {
        List<List<List<Integer>>>adj = new ArrayList<>();
        List<List<Integer>>middle = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        inner.add(1);
        inner.add(9);
        middle.add(inner);
        adj.add(middle);

//        inner.add(0);
//        inner.add(9);
//        middle.add(inner);
//        adj.add(middle);

        System.out.println(adj);
        int S = 0;
        int V = 2;
        System.out.println(Arrays.toString(dijkstra(adj,V,S)));     //T(N) = O (V + E l o g V).
    }
    public static class Node{
        int distance,node;

        Node(int distance,int node){
            this.distance = distance;
            this.node = node;
        }
    }

    public static int[] dijkstra(List<List<List<Integer>>>adj, int V,int S){

        int[]dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[S] = 0;

        PriorityQueue<Node>pq = new PriorityQueue<>((a,b)->a.distance - b.distance);
        pq.offer(new Node(0,S));

        while (!pq.isEmpty()){
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            for (int i = 0; i < adj.get(node).size(); i++) {
                int adjWt = adj.get(node).get(i).get(0);
                int adjNode = adj.get(node).get(i).get(1);

                if(dis + adjWt < dist[adjNode]){
                    dist[adjNode] = dis + adjWt;
                    pq.offer(new Node(dist[adjNode],adjNode));
                }
            }
        }
        return dist;
    }
}
