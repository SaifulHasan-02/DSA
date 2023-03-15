package WeeklyContest;

import java.util.Stack;

public class CountAsterisks {
    public static void main(String[] args) {
        String s = "yo|uar|e**|b|e***au|tifu|l";
        System.out.println(countAsterisks(s));
    }
    public static int countAsterisks(String s) {
        Stack<Character> stk = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            stk.push(s.charAt(i));
        }
        while (!stk.isEmpty()){
            if(stk.peek() == '|'){
                stk.pop();
                while(stk.peek() != '|'){
                    stk.pop();
                }
                stk.pop();
            }
            else{
                if(stk.peek()=='*'){
                    count++;
                    stk.pop();
                }else{
                    stk.pop();
                }
            }
        }
        return count;
    }
}
