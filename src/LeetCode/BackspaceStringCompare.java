package LeetCode;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s1 = "ab##";
        String s2 = "ad#c#";
        System.out.println(backspaceCompare(s1,s2));
    }
    public static boolean backspaceCompare(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        String p1 = "";
        String p2 = "";
        Stack<Character>stk1 = new Stack<>();
        for (int i = 0; i < ch1.length; i++) {
            if(ch1[i] == '#'&& stk1.size()>0){
                stk1.pop();
            }else{
                stk1.push(ch1[i]);
            }
        }
        for (int i = 0; i < stk1.size(); i++) {
            p1 = p1+stk1.pop();
        }
        System.out.println(p1);
        Stack<Character> stk2 = new Stack<>();
        for (char e:ch2) {
            if(e == '#' && stk2.size()>0){
                stk2.pop();
            }else{
                stk2.push(e);
            }
        }
        for (int i = 0; i < stk2.size(); i++) {
            p2 = p2+stk2.pop();
        }
        System.out.println(p2);
        System.out.println(stk2);
        if (p1.equals(p2))
            return true;
        return false;

    }
}
