package GraphInJava;

import java.util.ArrayList;
import java.util.List;

//dekhna pdega, q ki glt aa rha hai 

public class NumberOfOperationsToMakeNetworkConnected {
    public static void main(String[] args) {
        int[][]connections = {{0,1},{0,2},{1,2}};
        System.out.println(makeConnected(4, connections));

    }
    public static int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1) return -1;

        List<List<Integer>>graph = new ArrayList<>();
        for(int[] row : connections){
            List<Integer> rowList = new ArrayList<>();
            for(int element : row){
                rowList.add(element);
            }
            graph.add(rowList);
        }

        int cnt = 0;
        boolean[]visited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                cnt++;
                dfs(i, graph, visited);
            }
        }
        return cnt-1;
    }
    private static void dfs(int i, List<List<Integer>>graph, boolean[]visited){
        visited[i] = true;

        for(int node : graph.get(i)){
            if(!visited[node]){
                dfs(node, graph, visited);
            }
        }
    }
}
