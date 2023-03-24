package String;

import java.util.ArrayList;

public class RemoveAUsingRec {
    public static void main(String[] args) {
        String str = "aaabaacada";
        System.out.println(removeA(str,0));
        System.out.println(remove2A(str,0));
        System.out.println(remove3A(str));
    }

    private static String remove3A(String str) {
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return remove3A(str.substring(1));
        }else{
            return ch+remove3A(str.substring(1));
        }
    }

    private static String removeA(String str,int ind) {
        String p = "";
        if(ind == str.length())
            return p;
        if(str.charAt(ind)=='a'){
            p = p + removeA(str,ind+1);
        }
        else{
            p = p+str.charAt(ind)+removeA(str,ind+1);
        }
        return p;
    }
    private static ArrayList<String> remove2A(String str,int ind) {
        ArrayList<String>list = new ArrayList<>();
        if(str.isEmpty()){
            return list;
        }
        if(ind == str.length()){
            return list;
        }
        if(str.charAt(ind)=='a'){
            return remove2A(str,ind+1);
        }
        else{
            list.add(String.valueOf(str.charAt(ind)));
        }
        ArrayList<String> string = remove2A(str,ind+1);
        list.addAll(string);
        return list;

    }

}
