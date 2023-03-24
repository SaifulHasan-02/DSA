package String;


public class RotatedString {
    public static void main(String[] args) {
        String str1 = "fsbcnuvqhffbsaqxwp";
        String str2 = "wpfsbcnuvqhffbsaqx";
        System.out.println(isRotated(str1,str2));
    }
    public static boolean isRotated(String str1, String str2)
    {
        char[] ch1 = new char[str1.length()];
        char[] ch2 = new char[str1.length()];
        ch1 = str1.toCharArray();
        for(int i=0;i<ch1.length;i++){
            ch2[i] = ch1[i];
        }
        reverse(ch1,0,1);
        reverse(ch1,2,ch1.length-1);
        reverse(ch1,0,ch1.length-1);

        String strLeft = String.copyValueOf(ch1);
        reverse(ch2,ch2.length-2,ch2.length-1);
        reverse(ch2,0,ch2.length-3);
        reverse(ch2,0,ch2.length-1);
        String strRight = String.copyValueOf(ch2);
        if(strLeft.equals(str2) || strRight.equals(str2)){
            return true;
        }else{
            return false;
        }
    }



    public static void reverse(char[] ch,int s,int e){
        while(s<e){
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;
        }
    }
}
