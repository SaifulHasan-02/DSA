package SubSetProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jack {
    public static void main(String[] args) {
        int a = 3;
        int n = 9;
        int[]arr  = new int[n-1];
        int e = 1;
        int i = 0;
        for (; i < n-1; i++) {
            if(e != a){
                arr[i] = e;

            }else if( e == a){
                break;
            }
            e++;
        }
        e++;
        for ( ;i < n-1 ; i++) {
            arr[i] = e;
            e++;
        }
        System.out.println(Arrays.toString(arr));

        List<List<Integer>> list = subSet(arr);
        System.out.println(list);


    }
    public static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int e:arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer>inner = new ArrayList<>(outer.get(i));
                inner.add(e);
                outer.add(inner);
            }
        }
        return outer;
    }

}
