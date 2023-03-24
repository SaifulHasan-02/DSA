package CustomHashSetDesign;

public class MyHashSet {
    private int[] arr;
    public int size=-1;
    private static int DEFAULT_SIZE = 5;
    public MyHashSet(){
        this.arr = new int[DEFAULT_SIZE];
    }
    public void add(int key){
        if (contains(key)) {
            return;
        }else if(size == arr.length-1){
            resize();
            arr[++size] = key;
        }
        else{
            arr[++size] = key;
        }
    }
    public boolean contains(int key){
        for (int i = 0; i <= size; i++) {
            if(key == arr[i]){
                return true;
            }
        }
        return false;

    }
    public void remove(int key){
        for (int i = 0; i <= size; i++) {
            if(key == arr[i]){
                arr[i] = 0;
                size--;
            }
        }

    }
    public void resize(){
        int[] temp = new int[2*arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }
    public void display(){
        for (int e:arr) {
            System.out.print(e+" ");
        }
    }
}
