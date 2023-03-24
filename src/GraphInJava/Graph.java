package GraphInJava;

import java.util.*;

public class Graph {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            list.add(new ArrayList<>());
        }
        System.out.println(list);
        addEdge(list,0,1);
        addEdge(list,0,4);
        addEdge(list,1,3);
        addEdge(list,1,4);
        addEdge(list,2,1);
        addEdge(list,2,3);
        addEdge(list,3,4);
        System.out.println(list);
        System.out.println(bfs(list,V));
        System.out.println(dfsOfGraph(list,V));
        /*
        int[][] matrix = new int[V][V];
        getMatrix(matrix,V);
         */
    }

    private static ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj, int v) {
        ArrayList<Integer>ans = new ArrayList<>();
        boolean[] visited = new boolean[v];
        for (int i=0;i<v;i++){
            if(!visited[i]){
                dfs(i,visited,adj,ans);
            }
        }
        return ans;
    }
    public static void dfs(int node,boolean[] visited,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>ans){
        ans.add(node);
        visited[node]=true;
        for (Integer it : adj.get(node)){
            if(!visited[it]){
                dfs(it,visited,adj,ans);
            }
        }

    }

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>>list,int V){
        ArrayList<Integer> ans = new ArrayList<>();

        boolean[] visited = new boolean[V];
        for (int i = 0; i < V ; i++) {
            if(!visited[i]){
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(i);
                visited[i]=true;

                while (queue.size()!= 0){
                    Integer ele = queue.poll();
                    ans.add(ele);

                    for (Integer e:list.get(ele)) {
                        if(!visited[e]){
                            visited[e] = true;
                            queue.offer(e);
                        }

                    }

                }
            }

        }
        return ans;
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> list,int u,int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public static void getMatrix(int[][] G,int V){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in Matrix");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                G[i][j] = sc.nextInt();
            }
        }
        for (int[] arr:G) {
            for (int e:arr) {
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
