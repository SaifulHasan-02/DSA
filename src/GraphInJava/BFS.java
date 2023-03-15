package GraphInJava;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int V = 9;
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
        addEdge(list,5,6);
        addEdge(list,7,8);
        //System.out.println(bfs(list,V));
        ArrayList<Integer> CN = bfs(list,V);
        System.out.println(CN);
        //System.out.println(bfs2(list,V));
        ArrayList<Integer> cN = new ArrayList<>();
        cN.add(4);
        cN.add(2);
        cN.add(1);

        int [] A = new int[cN.size()];
        int i = 0;
        int k=1;
        int z = 0;
        while (z<cN.size()-1) {
            int ans = cN.get(z);
            ans = ans * cN.get(k);
            A[i] = ans;
            i++;
            k++;
            if(k>cN.size()-1) {
                z++;
                k = z+1;
            }
        }
        System.out.println(Arrays.toString(A));
        //System.out.println(ans);
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> list,int u,int v){
        list.get(u).add(v);
        list.get(v).add(u);

    }
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> list,int V){

        ArrayList<Integer> countN = new ArrayList<>();
        boolean[] visited = new boolean[V];
        int count = 0;
        for (int i = 0; i < V; i++) {
            if(!visited[i]){

                Queue<Integer>queue = new LinkedList<>();
                queue.offer(i);
                visited[i] = true;
                int countNode = 0;
                while (!queue.isEmpty()){
                    Integer temp = queue.poll();
                    countNode++;

                    for (Integer e:list.get(temp)) {
                        if(!visited[e]){
                            visited[e] = true;
                            queue.add(e);
                        }
                    }
                }
                countN.add(countNode);
                count++;

            }

        }

        return countN;
    }

    public static ArrayList<Integer> bfs2(ArrayList<ArrayList<Integer>> list,int V){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V ; i++) {
            if(!visited[i]){

                Queue<Integer> q = new LinkedList<>();
                q.offer(i);
                visited[i] = true;
                while (!q.isEmpty()) {
                    Integer temp = q.poll();
                    ans.add(temp);
                    for (Integer e : list.get(temp)) {
                        if (!visited[e]) {
                            visited[e] = true;
                            q.offer(e);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
