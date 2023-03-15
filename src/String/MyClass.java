package String;

import java.util.Scanner;

public class MyClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String target = sc.nextLine();

        getFreq(str,target);
    }

    public static void getFreq(String s ,String target){
        s = s.toLowerCase();

        target = target.toLowerCase();
        target = target.trim();
        System.out.println(target);

        int count = 0;
        String [] arr = s.split("\\|");


        /*
        char[] ch = s.toCharArray();
        int i = 0;
        int z = 0;
        String[] arr = new String[4];
        for (int j = 0; j < 4; j++) {
            arr[j]="";
        }
        while (i<ch.length){
            if(ch[i] != '|'){
                arr[z] = arr[z] + ch[i];

            }
            else{
                z++;
            }
            i++;
        }

         */
        for (String e: arr) {
            System.out.print(e+" ");
        }



        for (String e: arr) {
            if(e.equals(target)){
                count++;
            }
        }



       if (count == 0){
           System.out.println("word not found");
       }
       else {
           System.out.println(count);
       }
    }
}
