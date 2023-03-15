package SubSetProblem;
import java.util.*;
public class NumberOfMatchingSubsequences {
    public static void main(String[] args) {
       String s = "dsahjpjauf";
       String[] words = {"ahjpjau","ja","ahbwzgqnuk","tnmlanowax"};
       // System.out.println(numOfMatchingSubSeq(s,words));
        int ans = numMatchingSubseq(s,words);




    }
    public static int numMatchingSubseq(String s,String[] words){
        HashMap<Character,ArrayDeque<Integer>> map = new HashMap<>();

        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(map.containsKey(ch[i])) {
                map.get(ch[i]).offer(i);

            }
            else{
                map.put(ch[i],new ArrayDeque<>());
                map.get(ch[i]).offer(i);
            }
        }
        System.out.println(map);
        int count = 0;
        for (String str:words) {
            char[] c = str.toCharArray();
            int z = 0;
            int k = -1;
            for (int i = 0; i < c.length; i++) {

                if(map.containsKey(c[i])){
                    if(map.get(c[i]).size()>0) {
                        int ind = map.get(ch[i]).poll();
                        if (k < ind) {
                            k = ind;
                            z++;
                        }
                    }

                }
            }
            if(z == c.length-1){
                count++;
            }
        }
        return count;

    }
    /*
    public static int numOfMatchingSubSeq(String s,String[]words){
        HashSet<String> set = new HashSet<>();

        numMatchingSubseq(s,"",set);
        int count = 0;
        for (String e:words) {
            if(set.contains(e)){
                count++;
            }
        }
        return count;
    }


    public static void numMatchingSubseq(String up,String p,HashSet<String> set){

        if(up.length() == 0){
            set.add(p);
            return;
        }
        char ch = up.charAt(0);

        numMatchingSubseq(up.substring(1),p+ch,set);
        numMatchingSubseq(up.substring(1),p,set);

    }

     */
}
