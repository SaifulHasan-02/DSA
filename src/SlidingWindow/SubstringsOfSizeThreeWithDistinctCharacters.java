package SlidingWindow;
//leetcode
public class SubstringsOfSizeThreeWithDistinctCharacters {
    public static void main(String[] args) {
        String s = "xyzzaz";
        System.out.println(countGoodSubstrings(s));
        System.out.println(countGoodSubstrings2(s));
    }
    public static int countGoodSubstrings2(String s){
        int count = 0;
        for (int st = 0; st < s.length()-2; st++) {
            if(s.charAt(st) != s.charAt(st+1) && s.charAt(st+1) != s.charAt(st+2) && s.charAt(st) != s.charAt(st+2)){
                count++;
            }
        }
        return count;
    }
    public static int countGoodSubstrings(String s) {
        int i = 0;
        int j = 1;
        char[] ch = s.toCharArray();
        int count = 0;
        while(j < s.length()){
            if(j-i+1 < 3){
                j++;
            }
            else if(j-i+1 == 3){
                int st = i;
                int e = j;

                if(s.charAt(st) != s.charAt(st+1) && s.charAt(st+1) != s.charAt(e) && s.charAt(st) != s.charAt(e)){
                    count++;
                }
                i++;
                j++;
            }

        }
        return count;
    }
}
