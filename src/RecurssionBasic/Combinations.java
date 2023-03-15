package RecurssionBasic;
import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combinations/description/
public class Combinations {
    public static void main(String[] args) {
        int n = 4, k = 2;
        System.out.println(combine(n , k));
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer>inner = new ArrayList<>();
        combination(1,n,k,inner,outer);
        return outer;
    }
    private static void combination(int ind,int n, int k, List<Integer>inner, List<List<Integer>>outer){

        if(inner.size() == k){
            outer.add(new ArrayList<>(inner));
        }

        for(int i = ind; i <= n; i++){
            inner.add(i);
            combination(i+1,n,k,inner,outer);
            inner.remove(inner.size()-1);
        }

    }
}
