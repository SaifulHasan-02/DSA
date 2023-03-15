package Array;

public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[]operations = {"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(operations));
        System.out.println(finalValueAfterOperations2(operations));

    }
    public static int finalValueAfterOperations2(String[] operations){
        int X = 0;

        for (String  s: operations) {
            if(s.charAt(1)=='+'){
                X++;
            }else{
                X--;
            }
        }
        return X;
    }
    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String s: operations) {
            switch (s){
                case "++X" : ++X;
                break;
                case "X++" : X++;
                break;
                case "--X" : --X;
                break;
                default: X--;
                break;
            }
        }
        return X;
    }
}
