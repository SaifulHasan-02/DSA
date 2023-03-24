package Array;

public class CalculateDesktop {
    public static void main(String[] args) {
        char[] productID = {'a','v','i','k','e','l'};
        System.out.println(calcualteDesktopProductsIDs(productID));
    }
    public static int calcualteDesktopProductsIDs(char[] productID){
        int count = 0;
        for(char c :productID){
            if(c == 'a' || c=='e' || c=='i' || c== 'o' || c=='u'|| c == 'A' || c=='E' || c=='I' || c== 'O' || c=='U'){
                continue;
            }else{
                count++;
            }
        }
        return count;
    }
}
