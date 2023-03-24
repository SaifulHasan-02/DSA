package DynamicProgramming;

//https://leetcode.com/problems/decode-ways/

public class DecodeWays {
    public static void main(String[] args) {
        String s = "06";
        System.out.println(numDecodings(s));
    }
    public static int numDecodings(String s){

        return calculate(s);
    }
    public static int calculate(String s){
        if(s.length() == 0)
            return 1;

        if(s.charAt(0) == 0)
            return 0;


        if(s.length()>=2 && Integer.parseInt(s.substring(0,2))<27){
            return calculate(s.substring(1))+calculate(s.substring(2));
        }
        else
            return calculate(s.substring(1));
    }
}
