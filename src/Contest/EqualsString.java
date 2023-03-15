package Contest;

import java.util.HashMap;

public class EqualsString {
    public static void main(String[] args) {
        String S = "zlxceuycugnkrstvwc";
        String T = "ylxceuycugnkrstvwc";
        System.out.println(isEqual(S,T));
    }
    public static boolean isEqual(String S, String T) {
        // code here
        if(S.length() == 0 || T.length() == 0){
            return false;
        }

        if(Math.abs(S.length()-T.length()) != 0){
            return false;
        }

        char[] arr = T.toCharArray();
        for(int i =0;i<S.length();i++){
            if(S.charAt(i) != T.charAt(i)){
                if(isContains(S.charAt(i),T)){
                    int ind = contains(S.charAt(i),T);
                    if(ind != -1) {
                        swap(arr, i, ind);
                    }
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    public static int contains(char c,String T){
        for(int i =0;i<T.length();i++){
            if(T.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }
    public static void swap(char[] arr,int l,int r){
        char t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }
    public static boolean isContains(char c,String T){

        for(int i =0;i<T.length();i++){
            if(T.charAt(i) == c){
                return true;
            }
        }
        System.out.println("saiful");
        return false;
    }
}
