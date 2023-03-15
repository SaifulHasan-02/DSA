package String;


public class Arrangement {
    public static void main(String[] args) {
        String str = "BBBBBGGGGGBG";

        System.out.println(getArrangement(str));

    }

    private static int getArrangement(String up) {
        int count = 0;
        char[] ch = up.toCharArray();
        int s = 0;

        int e = up.length()-1;
        while(s<e){
            int i = s+1;
            int j = e-1;
            if(ch[s] == 'B' && ch[i] == 'G'){
                s++;
            }
            else if(ch[j] == 'B' && ch[e] == 'G'){
                e--;
            }


        }



        return count;
    }

    private static void swaps(char[] ch, int first, int last) {

            char temp = ch[first];
            ch[first] = ch[last];
            ch[last] = temp;
    }

}
