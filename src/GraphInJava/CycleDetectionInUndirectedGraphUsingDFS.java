package GraphInJava;


import java.util.ArrayList;



public class CycleDetectionInUndirectedGraphUsingDFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int V = 5;
        for (int i = 0; i < V; i++) {
            list.add(new ArrayList<>());
        }
        addEdge(list,0,1);
        addEdge(list,1,2);
        addEdge(list,2,3);
        addEdge(list,3,4);
        addEdge(list,4,1);
        System.out.println(list);
        System.out.println(isCycle(list,V));
    }
    public static  void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static boolean isCycle(ArrayList<ArrayList<Integer>>adj,int V){
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                if(isCheck(adj,i,-1,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCheck(ArrayList<ArrayList<Integer>> adj,int node,int parent,boolean[]visited){
        visited[node] = true;

        for (int it:adj.get(node)) {
            if(!visited[it]){
                if(isCheck(adj,it,node,visited)) {
                    return true;
                }
            }
            else if(it != parent){
                return true;
            }
        }
        return false;
    }
}
