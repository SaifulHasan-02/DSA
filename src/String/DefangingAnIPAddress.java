package String;

//https://leetcode.com/problems/defanging-an-ip-address/

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for (Character ch: address.toCharArray()) {
            if(ch == '.'){
                sb.append("[.]");
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();

    }
}
