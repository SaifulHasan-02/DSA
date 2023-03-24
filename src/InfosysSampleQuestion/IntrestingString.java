package InfosysSampleQuestion;

import java.util.HashMap;
import java.util.Map;

public class IntrestingString {
    public static void main(String[] args) {
        String s = "ababcc";
        System.out.println(getMaxNoOfPieces(s));
    }
    public static int getMaxNoOfPieces(String s){
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        char[] ch  = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);
            }else{
                map.put(ch[i],1);
            }
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Character,Integer> m :map.entrySet()){
            if(m.getValue()>max){
                max = m.getValue();
            }
            if(m.getValue()<min){
                min = m.getValue();
            }
        }
        return gcd(min,max);

    }
    public static  int gcd(int a,int b){
        if(a == 0 )return b;
        if(b == 0) return a;
        if(a > b){
            return gcd(a%b,b);
        }

        return gcd(b%a,a);
    }
}
