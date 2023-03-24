package String;

//https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length()-1; i++) {
            int a = getVal(s.charAt(i));
            int b = getVal(s.charAt(i+1));

            if(a >= b){
                ans += a;
            }
            else{
                ans -= a;
            }
        }
        ans = ans + getVal(s.charAt(s.length()-1));
        return ans;

    }
    public static int getVal(char c){
        int val = -1;
        switch (c) {
            case 'I' ->  val = 1;
            case 'V' -> val = 5;
            case 'X' -> val = 10;
            case 'L' -> val = 50;
            case 'C' -> val = 100;
            case 'D' -> val = 500;
            case 'M' -> val = 1000;
            default -> val = 0;

        }
        return val;
    }
}
