package GraphInJava;

/*
    https://practice.geeksforgeeks.org/problems/shortest-path-in-undirected-graph-having-unit-distance/1
 */

import java.util.*;


public class ShortestPathInUndirectedGraphWithUnitWeight {
    public static void main(String[] args) {

        int[][]edge = {{0,1},{0,3},{3,4},{4 ,5}
                        ,{5, 6},{1,2},{2,6},{6,7},{7,8},{6,8}};
        int n = 9,m = 10,src = 0;
        System.out.println(Arrays.toString(shortestPath(edge,n,m,src)));

    }
    public static int[] shortestPath(int[][]edges,int n, int m, int src){
        List<List<Integer>>adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        Queue<Integer>q = new LinkedList<>();
        int[]dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = (int)1e9;
        }
        dist[src] = 0;

        q.offer(src);

        while (!q.isEmpty()){
            int node = q.peek();
            q.poll();

            for (int it:adj.get(node)) {
                if(1+dist[node] < dist[it]){
                    dist[it] = 1+dist[node];
                    q.offer(it);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(dist[i] == (int)1e9){
                dist[i] = -1;
            }
        }
        return dist;
    }
}
