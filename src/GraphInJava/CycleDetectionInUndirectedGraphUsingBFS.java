package GraphInJava;
import java.util.*;

public class CycleDetectionInUndirectedGraphUsingBFS {
    public static void main(String[] args) {
        List<List<Integer>> list = new LinkedList<>();
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
        System.out.println(isCycle2(list,V));



    }
    public static void addEdge(List<List<Integer>> list,int u,int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public static boolean isCycle2(List<List<Integer>>adj,int V){

        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                if(check(adj,i,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean check(List<List<Integer>>adj,int node,boolean[]visited){
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{node,-1});

        while (!q.isEmpty()){
            int[]arr = q.poll();
            int curr = arr[0];
            int par = arr[1];

            for (int it: adj.get(curr)) {
                if(!visited[it]){
                    visited[it] = true;
                    q.offer(new int[]{it,curr});
                }
                else if(it != par){
                    System.out.println(it);
                    return true;
                }
            }
        }
        return false;
    }
    static class Node{
        int f,s;
        Node(int f,int s){
            this.f = f;
            this.s = s;
        }
    }
    public static boolean isCycle(List<List<Integer>>list,int V){
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                if(checkForCycle(i,list,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkForCycle(int el,List<List<Integer>>list,boolean[] visited){

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(el,-1));
        visited[el]  = true;
        while (!q.isEmpty()){
            int ft = q.peek().f;
            int sc = q.peek().s;
            q.remove();
            for (Integer e: list.get(ft)) {
                if(!visited[e]){
                    q.add(new Node(e,ft));
                    visited[e] = true;
                }
                else if(e != sc) {
                    System.out.println(e);
                    return true;
                }
            }
        }
        return false;
    }
}
