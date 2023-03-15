package GraphInJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsPractice {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();

        int V = 5;
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj,0,1);
        addEdge(adj,0,3);
//        addEdge(adj,1,0);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
//        addEdge(adj,2,1);
        addEdge(adj,2,4);
//        addEdge(adj,3,0);
//        addEdge(adj,3,1);
        addEdge(adj,3,4);
//        addEdge(adj,4,2);
//        addEdge(adj,4,3);

//        System.out.println(adj);

        System.out.println(bfsTraversal(adj,V)); //T(n) = O(V+E) ,S(N) = O(V)
        System.out.println(bfsTra(adj,V));
    }
    public static void addEdge(List<List<Integer>>adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static List<Integer> bfsTra(List<List<Integer>>adj,int V){
        List<Integer>ans = new ArrayList<>();
        boolean[]vis = new boolean[V];
        Queue<Integer>q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if(!vis[i]){
                bfs(adj,i,vis,ans,q);
            }
        }
        return ans;
    }
    public static void bfs(List<List<Integer>>adj,int node,boolean[]vis,List<Integer>ans,Queue<Integer>q){
        vis[node] = true;
        q.offer(node);

        while (!q.isEmpty()){
            int curr = q.poll();
            ans.add(curr);

            for (int it: adj.get(curr)) {
                if(!vis[it]){
                    vis[it] = true;
                    q.offer(it);
                }
            }
        }
    }
    public static List<Integer> bfsTraversal(List<List<Integer>>adj,int V){
        List<Integer> ans = new ArrayList<>();
        Queue<Integer>q = new LinkedList<>(); //O(V)
        boolean[] visited = new boolean[V];  //O(V)

        for (int i = 0; i < V; i++) {
            if(!visited[i]) {
                visited[i] = true;
                q.offer(i);

                while (!q.isEmpty()) {
                    int temp = q.poll();
                    ans.add(temp);

                    for (int node : adj.get(temp)) {
                        if (!visited[node]) {
                            visited[node] = true;
                            q.offer(node);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
