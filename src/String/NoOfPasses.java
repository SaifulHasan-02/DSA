package String;

public class NoOfPasses {
    public static void main(String[] args) {
        String str = "AABAAA";

        System.out.println(calculate_passes(str));
    }
    public static int calculate_passes(String s){
        int n = s.length();
        int count = 0;
        int ind = 0;
        for (Character c:s.toCharArray()) {
            if(ind >= n-1)
                break;
            if(c == 'A'){
                ind+=2;

            }
            else if(c == 'B'){
                ind -= 1;
            }
            count++;
        }
        return count;
    }
}
