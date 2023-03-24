package Array;


public class MaxMin {
    public static void main(String[] args) {
        int[]arr = {10,7,50,20,30,15,5};

        System.out.println(minMax(arr));
    }
    public static int minMax(int[]arr){
       Pairs p = new Pairs(Integer.MAX_VALUE,Integer.MIN_VALUE);
       getMinMax(arr,0,arr.length-1,p);
        System.out.println(p.mi);
        System.out.println(p.mx);
       return p.mi + p.mx;
    }
    public static void getMinMax(int[]arr,int start,int end,Pairs p){
        if(start == end){
            p.mi = Math.min(p.mi,arr[start]);
            p.mx = Math.max(p.mx,arr[start]);
            return;
        }
        else if(end == start + 1){
            if(arr[start] > arr[end]){
                p.mi = Math.min(p.mi,arr[end]);
                p.mx = Math.max(p.mx,arr[start]);
            }
            else{
                p.mi = Math.min(p.mi,arr[start]);
                p.mx = Math.max(p.mx,arr[end]);
            }
            return;
        }
        int mid = start + (end - start)/2;

        getMinMax(arr,start,mid,p);
        getMinMax(arr,mid+1,end,p);
    }

}
