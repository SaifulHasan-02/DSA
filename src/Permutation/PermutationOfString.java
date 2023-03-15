package Permutation;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
    public static void main(String[] args) {
        String str = "abc";
//        permutation("",str);
        //System.out.println(getCountPermutation("",str));
//        System.out.println(getPermutation("",str));
        permutation2(str,"");
    }
    public static void permutation2(String up,String p){
        if(up.length() == 0){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            permutation2(up.substring(1),f+c+l);
        }
    }
    public static int getCountPermutation(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            count = count+getCountPermutation(f+ch+l,up.substring(1));
        }
        return count;
    }
    public static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            permutation(l+ch+f,up.substring(1));
        }
    }
    public static List<String> getPermutation(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            List<String> li = getPermutation(f+ch+l,up.substring(1));
            ans.addAll(li);
        }
        return ans;

    }

}
