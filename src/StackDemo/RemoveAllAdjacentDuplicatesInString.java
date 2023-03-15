package StackDemo;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));

    }
    private static String removeDuplicates(String s){
        Stack<Character>stk = new Stack<>();

        for (Character ch: s.toCharArray()) {
            if(!stk.isEmpty() && stk.peek() == ch){
                stk.pop();
            }
            else{
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
