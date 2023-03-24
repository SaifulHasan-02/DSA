package Array;

public class MaxMinAvg {
    public static void main(String[] args) {
        int[] salary = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        System.out.println(average(salary));
    }
    public static double average(int[] salary) {
        int n = salary.length;
        System.out.println(n);
        int max = salary[0];
        int min = salary[0];
        int maxInd = -1;
        int minInd = -1;
        for(int i =0;i<n;i++){
            if(salary[i]>=max){
                max = salary[i];
                maxInd = i;
            }
        }
        for(int i =0;i<n;i++){
            if(salary[i]<=min){
                min = salary[i];
                minInd = i;
            }
        }
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum=sum+salary[i];
        }
        System.out.println(sum);
        System.out.println(salary[minInd]);
        System.out.println(salary[maxInd]);

        sum= sum-(salary[maxInd]+salary[minInd]);

        System.out.println(sum);
        double avg =(double)sum/(n-2);
        return avg;


    }
}
