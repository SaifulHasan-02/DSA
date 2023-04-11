package StackDemo;

import java.util.Stack;

public class RemovingStarsFromAString {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
    public static String removeStars(String s) {
        Stack<Character> stk = new Stack<>();

        for(Character ch : s.toCharArray()){
            if(ch == '*'){
                stk.pop();
            }else{
                stk.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()){
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}
