package GraphInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DfsPractice {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();

        int V = 5;
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,3);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,2,4);
        addEdge(adj,3,4);

        System.out.println(adj);

        System.out.println(dfsTraversal(adj,V));
        System.out.println(dfsTraversalItr(adj,V));

    }
    public static List<Integer> dfsTraversalItr(List<List<Integer>>adj,int V){//pta nhi shi hai ki nhi
        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                visited[i] = true;

                s.push(i);
                while (!s.isEmpty()){
                    int node = s.peek();
                    ans.add(node);
                    s.pop();

                    for (int e:adj.get(node)) {
                        if(!visited[e]){
                            visited[e] = true;
                            s.push(e);
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static List<Integer> dfsTraversal(List<List<Integer>>adj,int V){
        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                dfs(adj,i,visited,ans);
            }
        }
        return ans;
    }
    public static void dfs(List<List<Integer>> adj,int node,boolean[] visited,List<Integer>ans){
        visited[node] = true;
        ans.add(node);
        for (int e:adj.get(node)) {
            if(!visited[e]){
                dfs(adj,e,visited,ans);
            }
        }
    }
    public static void addEdge(List<List<Integer>>adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
