package String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "reverse";
        System.out.println(reverseUsingSB(str));
        String ans = reverse(str);
        System.out.println(ans);
        if(str.equals(ans)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    public static String reverseUsingSB(String s){
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String ans = String.valueOf(sb);
        return ans;
    }
    public static String reverse(String str){
        if(str == null){
            throw new IllegalArgumentException("Null is not valid input");
        }
        StringBuilder sb = new StringBuilder();
        //Convert String to char array in java
        char[] ch = str.toCharArray();
        for(int i = ch.length-1;i>=0;i--){
            sb.append(ch[i]);
        }
        String ans = sb.toString();
        return ans;
    }
}
