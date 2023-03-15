package Array;

public class EarthMinutes {
    public static void main(String[] args) {
        int minutes = 1000;
        int seconds = 20;
        System.out.println(earth_minutes(minutes,seconds));
     }
     public static int earth_minutes(int minutes,int seconds){

        double secOnEarth = 60.0/seconds;

        int minOnEarth = (int)(minutes/secOnEarth);

        int rem = (int)(minutes % secOnEarth);

        if(rem > 0){
            minOnEarth+=1;
        }
        return minOnEarth;

     }
}
