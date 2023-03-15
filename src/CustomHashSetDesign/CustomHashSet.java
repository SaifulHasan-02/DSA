package CustomHashSetDesign;

import java.util.ArrayList;

public class CustomHashSet {
    private ArrayList<Integer>list;
    public CustomHashSet(){
        this.list = new ArrayList<>();

    }
    public void add(int key){
        if(contains(key)){
            return;
        }else{
            list.add(key);
        }
    }
    public void remove(int key){
        list.removeIf(e ->  (int)e == key);
    }
    public boolean contains(int key){
        if(list.contains(key)){
            return true;
        }
        return false;
    }
    public void display(){
        for (Integer e:list) {
            System.out.print(e+" ");
        }
    }
}
