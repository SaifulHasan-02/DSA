package SlidingWindow;
//https://leetcode.com/problems/implement-strstr/
public class ImplementstrStr {
    public static void main(String[] args) {
        String haystack = "abc";
        String needle = "c";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {

        int i =0;
        int j =0;
        int ans = -1;
        while(j<haystack.length()){
            String s = haystack.substring(i,j);
            if(j<needle.length()){
                j++;
            }
            else if(s.length()==needle.length()){

                if(s.equals(needle)){
                    ans = i;
                    break;
                }
                j++;
            }
            else {
                i++;

            }
        }
        return ans;
    }
}
