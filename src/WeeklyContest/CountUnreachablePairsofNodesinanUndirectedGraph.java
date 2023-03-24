package WeeklyContest;
import java.util.*;
import java.util.Arrays;
public class CountUnreachablePairsofNodesinanUndirectedGraph {
    public static void main(String[] args) {
        int[][] mat = {{0,1},{0,2},{1,2}};

        int n = 3;
        List<List<Integer>> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            List<Integer>inner = new LinkedList<>();
            for (int j = 0; j < mat[i].length; j++) {
                inner.add(mat[i][j]);
            }
            list.add(inner);

        }
        System.out.println(list);
        System.out.println(countPairs(n,list));

    }

    public  static long countPairs(int n,List<List<Integer>> list ) {
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(!visited[i]){

                Queue<Integer> q =new LinkedList<>();
                q.add(i);

                visited[i] = true;
                while (!q.isEmpty()){
                    int temp = q.peek();
                    q.remove();

                    for (Integer it:list.get(i)) {
                        if(!visited[it]){
                            q.add(it);
                            visited[it] = true;
                        }
                    }
                }
                count++;
            }
        }
        return count-1;

    }

}
