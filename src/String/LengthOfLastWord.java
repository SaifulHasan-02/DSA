package String;

//https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        char[] ch = s.toCharArray();
        int len = 0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if(ch[i] != ' ')len++;
            else break;
        }
        return len;
    }

}
