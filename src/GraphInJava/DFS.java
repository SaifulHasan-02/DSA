package GraphInJava;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int V = 5;
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
        System.out.println(list);
        System.out.println(dfs(list,V));
        System.out.println(dfsSelf1(list,V));
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> list,int u,int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> list,int V){
        ArrayList<Integer>ans = new ArrayList<>();
        boolean[] visited = new boolean[V+1];
        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                dfs2(list,i,visited,ans);
            }
        }
        return ans;
    }
    public static void dfs2(ArrayList<ArrayList<Integer>> list,int node,boolean[]visited,ArrayList<Integer>ans){

        ans.add(node);
        visited[node]=true;
        for (Integer it:list.get(node)) {
            if(!visited[it]){
                visited[it]=true;
                dfs2(list,it,visited,ans);
            }
        }
    }

    public static ArrayList<Integer> dfsSelf1(ArrayList<ArrayList<Integer>> list,int V){
        ArrayList<Integer> ans = new ArrayList<>();

        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                dfsSelf2(list,ans,i,visited);
            }
        }
        return ans;
    }
    public static void dfsSelf2(ArrayList<ArrayList<Integer>>list,ArrayList<Integer>ans,int node,boolean[] visited){
        ans.add(node);
        visited[node] = true;
        for (Integer e:list.get(node)) {
            if(!visited[node]){
                dfsSelf2(list,ans,e,visited);
            }
        }
    }
}
