package Array;

public class ToLowerCaseMathod {
    public static void main(String[] args) {
        String s = "HEllo";

        System.out.println(toLowerCase(s));
    }
    public static String toLowerCase(String s){
        char[] ch = s.toCharArray();
        String ans = "";
        for (char c: ch) {
            if(c >= 65 && c <= 96){
                c = (char)(c+32);
                ans += c;
            }else{
                ans += c;
            }
        }
        return ans;
    }
}
