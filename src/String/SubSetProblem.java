package String;

import java.util.ArrayList;
import java.util.List;

public class SubSetProblem {
    public static void main(String[] args) {

        String str = "abball";
        String p = "";
        subSet(p,str,str);
        //System.out.println(subSet2(p,str));

        /*
        int[] arr = {1,2,3};
        List<List<Integer>> ans = sebSetItr(arr);
        System.out.println(ans);
        for (List<Integer> list:ans) {
            System.out.println(list);

        }

         */
    }
    //Time Complexity = T(N* 2^N),where N = no. of element in array
    //Space Complexity = S(N* 2^N),where N = no. of element in array
    private static List<List<Integer>> sebSetItr(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num: arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    private static void subSet(String p,String up,String org) {
        if(up.isEmpty()){
            //System.out.println(p);
            if(p.length()>1 && p.charAt(0)==p.charAt(p.length()-1)){
                System.out.println(p);
            }
            return;
        }

        char ch = up.charAt(0);
        subSet(p+ch,up.substring(1),org);
        subSet(p,up.substring(1),org);

    }

    public static List<List<String>> subSet2(String p,String up){
        List<List<String>> majorList = new ArrayList<List<String>>();
        if(up.isEmpty()){
            List<List<String>> minorList = new ArrayList<List<String>>();
            List<String>list = new ArrayList<String>();
            list.add(p);
            minorList.add(list);
            return minorList;
        }
        char ch = up.charAt(0);
        List<List<String>> left = subSet2(p+ch,up.substring(1));
        List<List<String>> right = subSet2(p,up.substring(1));
        majorList.addAll(left);
        majorList.addAll(right);

        return majorList;
    }


}
