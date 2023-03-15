package String;

public class ReverseVovels {
    public static void main(String[] args) {
        String s ="leetcode";
        System.out.println(reverseVowels(s));//most case me fail hota hai
        System.out.println(reverseVowelsBest(s));//all test cases passed
    }

    private static String reverseVowelsBest(String s) {
        int st = 0;
        int e = s.length()-1;
        String vovels = "aeiouAEIOU";
        char[] ch = s.toCharArray();
        while(st<e){
            while(st<e &&!vovels.contains(ch[st]+"")){
                st++;
            }
            while (st<e && !vovels.contains(ch[e]+"")){
                e--;
            }
            char temp = ch[st];
            ch[st] = ch[e];
            ch[e] = temp;
        }
        String ans = String.valueOf(ch);
        return ans;
    }

    public static String reverseVowels(String s) {
        s = s.toLowerCase();
        int st = 0;
        int e = s.length()-1;
        int first = -1;
        int second = -1;
        char[] ch = s.toCharArray();
        while(st<=e){
            if(ch[st] == 'a' || ch[st] =='e' || ch[st] =='i' || ch[st] =='o'|| ch[st] =='u'|| ch[st] == 'A' || ch[st] =='E' || ch[st] =='I' || ch[st] =='O'|| ch[st] =='U'){
                first = st;
            }
            if(ch[e] == 'a'||ch[e] =='e'||ch[e] =='i'|| ch[e] =='o'|| ch[e] =='u'|| ch[e] == 'A' || ch[e] =='E' || ch[e] =='I' || ch[e] =='O'|| ch[e] =='U'){
                second = e;
            }
            if(first >= 0 && second >= 0){
                swap(ch,first,second);
                first=-1;
                second=-1;

            }
            st++;
            e--;

        }
        String str = String.valueOf(ch);
//        String str = new String(ch);
        System.out.println(str);
        return str;
    }
    public static void swap(char[] ch ,int f,int sc){
        char temp = ch[f];
        ch[f] = ch[sc];
        ch[sc] = temp;
    }
}
