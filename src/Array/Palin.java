package Array;

public class Palin {
    public static void main(String[] args) {
        int n = 121;
        //isPalindrome(n);
        //isPalindrome2("maaddam");
        System.out.println(isPalin(n));

    }
    public static boolean isPalin(int n){
        StringBuilder s = new StringBuilder(n);
        StringBuilder str = new StringBuilder(s).reverse();

        return s == str;
    }
    public static void isPalindrome2(String s){
        int st = 0;
        int e = s.length()-1;
        boolean flag = false;
        while (st<e){
            if(s.charAt(st) != s.charAt(e)){
                flag = true;
                break;
            }
            else{
                st++;
                e--;
            }
        }
        if(!flag) System.out.println("Palindrom");

        else System.out.println("Not Palindrome");
    }
    public static void isPalindrome(int n){
        int m = n;
        int num = 0;
        while (m != 0){
            int rem = m%10;
            num = num*10 +rem;
            m /=10;
        }
        if(num == n){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not ");
        }

    }
}
