package String;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        permutation(p,up);
        System.out.println(getPermutation(p,up));
        System.out.println(getPermutation2(p,up));
        System.out.println(permutationCount(p,up));
    }

    private static List<String> getPermutation(String p, String up) {
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        List<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll( getPermutation(f+ch+s,up.substring(1)));
        }
        return ans;
    }
    public static List<List<String>> getPermutation2(String p,String up){
        if(up.isEmpty()){
            List<List<String>> list = new ArrayList<List<String>>();
            List<String> inner = new ArrayList<>();
            inner.add(p);
            list.add(inner);
            return list;
        }
        List<List<String>> ans = new ArrayList<List<String>>();
        List<List<String>> m = new ArrayList<List<String>>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            //ans.addAll(getPermutation2(f+ch+s,up.substring(1)));
            m = getPermutation2(s+ch+f,up.substring(1));
            ans.addAll(m);
        }

        return ans;
    }

    public static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1));
        }
    }
    public static int permutationCount(String p,String up){
        if(up.isEmpty()){
            //System.out.println(p);
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count += permutationCount(f+ch+s,up.substring(1));
        }
        return count;
    }
}
