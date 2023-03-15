package String;

public class RemoveDigitFromNumberToMaximizeResult {
    public static void main(String[] args) {
        String number = "123";
        char digit = '3';
        System.out.println(removeDigit(number,digit));
    }
    public static String removeDigit(String number, char digit) {
        boolean flag = false;

        for (Character ch : number.toCharArray()) {
            if(ch == digit){
                flag = true;
            }
        }
        return "";
    }
}
