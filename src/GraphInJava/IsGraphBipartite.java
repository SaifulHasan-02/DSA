package GraphInJava;

//https://leetcode.com/problems/is-graph-bipartite/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class IsGraphBipartite {
    public static void main(String[] args) {
        int[][] graph = {{1,3},{0,2},{1,3},{0,2}};
        System.out.println(isBipartite(graph));
    }
    public static boolean isBipartite(int[][] graph){
        int n = graph.length;
        int[]color = new int[n];
        Arrays.fill(color,-1);
        for (int i = 0; i < n; i++) {
            if(color[i] == -1){
                if(!check(i, graph, color)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean check(int start,int[][]graph,int[]color){
        Queue<Integer> q = new LinkedList<>();

        color[start] = 0;
        q.offer(start);

        while (!q.isEmpty()){
            int node = q.peek();
            q.remove();

            for (int it:graph[node]) {
                if(color[it] == -1){
                    color[it] = 1 - color[node];
                    q.offer(it);
                }
                else if(color[it] == color[node]){
                    return false;
                }
            }
        }
        return true;
    }
}
