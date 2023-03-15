package String;

//https://leetcode.com/problems/make-the-string-great/
import java.util.Stack;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        String s = "mC";

        System.out.println(makeGood(s));
    }
    public static String makeGood(String s) {

        Stack<Character> stk = new Stack<>();
        char[]ch = s.toCharArray();


        for(int i = 0; i<ch.length ; i++){
           if(!stk.isEmpty() && Math.abs(stk.peek()-ch[i])==32){
               stk.pop();
           }
           else{
               stk.push(ch[i]);
           }
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.peek());
            stk.pop();
        }

        return new String(sb.reverse());

    }
}
