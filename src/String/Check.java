package String;

public class Check {
    public static void main(String[] args) {
        String str = "abball";
        getSub(str,str,"");
    }
    public static void getSub(String org,String up,String p){
        if(up.isEmpty()){
            if(p.length()>0 &&(org.charAt(0) == p.charAt(0)) && (org.charAt(org.charAt(org.length()-1))==p.charAt(p.length()-1))){
                System.out.println(p);
            }
            return;
        }
        char c = up.charAt(0);
        getSub(org,up.substring(1),p+c);
        getSub(org,up.substring(1),p);
    }
}
