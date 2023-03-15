package String;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        char c = 'a';
        int as = (int)'a';

        System.out.println(as);
        for(int i =0;i<26;i++){
            char ch = (char)('a'+i);
            series = series + ch;
        }
        System.out.println(series);
        String S = "";
        for(int i =0;i<26;i++){
            char ch = (char)('A'+i);
            S += ch;
        }
        System.out.println(S);


    }
}
