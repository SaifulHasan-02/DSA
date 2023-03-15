package HashMapDesign;

import java.util.ArrayList;

public class CustomHashMap {
    private ArrayList<Integer> list;
    public CustomHashMap() {
        this.list = new ArrayList<>();
    }

    public void put(int key, int value) {
        list.add(key,value);
    }

    public int get(int key) {
        if(list.contains(key)){
            return list.get(key);
        }
        else{
            return -1;
        }
    }

    public void remove(int key) {
        if(key<list.size()){
            list.remove(key);
        }
    }
    public void display(){
        for (Integer e:list) {
            System.out.println(e);
        }
    }
}
