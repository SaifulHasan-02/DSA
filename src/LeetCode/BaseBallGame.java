package LeetCode;

import java.util.Stack;

public class BaseBallGame {
    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        //System.out.println(calPoints(ops));
        System.out.println(calPoints2(ops));
    }

    private static int calPoints2(String[] ops) {
        int points = 0;
        Stack<Integer> stk = new Stack<>();
        for (String str:ops) {
            switch (str) {
                case "D" -> {
                    int e = stk.peek();
                    stk.push(2 * e);
                }
                case "C" -> stk.pop();
                case "+" -> {
                    int e1 = stk.pop();
                    int e2 = stk.peek();
                    stk.push(e1);
                    stk.push(e1 + e2);
                }
                default -> stk.push(Integer.parseInt(str));
            }

        }
        while (!stk.isEmpty()){
            points += (int)stk.pop();
        }
        return points;
    }

    public static int calPoints(String[] ops) {
        Stack<Integer>stk = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            if(ops[i].equals("D")){
                Integer e =  stk.peek();
                stk.push(2*e);
            }
            else if(ops[i].equals("C")){
                stk.pop();
            }
            else if(ops[i].equals("+")){
                int e1 = stk.pop();
                int e2 = stk.peek();
                stk.push(e1);
                stk.push(e1+e2);
            }
            else{
                stk.push(Integer.parseInt(ops[i]));
            }
        }
        int sum = 0;
        while (!stk.isEmpty()){
            sum = sum +(int)stk.pop();
        }
        return sum;
    }
}
