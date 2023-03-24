package String;

public class RemoveSpaces {
    public static void main(String[] args) {
        String s = " good day ";
        System.out.println(remove_spaces(s));
    }
    public static String remove_spaces(String s){
        String ans = "";
        for (Character c:s.toCharArray()) {
            if(c == ' '){
                continue;
            }else{
                ans = ans+c;
            }
        }
        return ans;
    }
}
