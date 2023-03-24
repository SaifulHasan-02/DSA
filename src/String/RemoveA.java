package String;


public class RemoveA {
    public static void main(String[] args) {
        //String str = "baccad";
        // System.out.println(remove(str));
        //String p = "";
       // System.out.println(removeRec(p,str));
        String str2 = "bacsapplehgjhs";
        System.out.println(removeApple(str2));
    }
    public static String remove(String str){
        String ans = "";
        str = str.toLowerCase();
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i) !='a'){
                ans = ans+str.charAt(i);
            }
        }
        if(str.contains("a")){
            System.out.println("true");
        }
        if(ans.contains("a")){
            System.out.println("true");
        }
        return ans;
    }
    public static String removeRec(String p,String up){
        if(up.isEmpty()){
            //System.out.println(p);
            return p;
        }
        char ch = up.charAt(0);
        if(ch != 'a'){
           return removeRec(p+ch,up.substring(1));
        }
        return removeRec(p,up.substring(1));

    }
    public static String removeApple(String str){
        if(str.isEmpty()){
            return str;
        }
        if(str.startsWith("apple")){
           return removeApple(str.substring(5));
        }

        return removeApple(str.charAt(0) + str.substring(1));

    }
}
