package String;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "abced";
        System.out.println(rotateString(s,goal)); //T(n) = O(n^2)
        System.out.println(rotateString2(s,goal));//T(n) = O(n)
    }
    public static boolean rotateString2(String s,String goal){

        return s.length() == goal.length() && (s+s).contains(goal);

    }
    public static boolean rotateString(String s, String goal) {
        int n = s.length();
        int j = 1;
        for (int i = 0; i < n; i++) {
            if((s.substring(j,n)+s.substring(0, i + 1)).equals(goal)){
                return true;
            }
            j++;
        }
        return false;


    }
}
