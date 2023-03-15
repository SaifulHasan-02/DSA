package CustomHashSetDesign;

public class MyHashSetDemo {
    public static void main(String[] args) {
        /*
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(1); // return True
        myHashSet.contains(3); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(2); // return True
        myHashSet.remove(2);   // set = [1]
        myHashSet.contains(2); // return False, (already removed)

        System.out.println(myHashSet.size);
        System.out.println(myHashSet.contains(5));
        //myHashSet.remove(5);
        System.out.println(myHashSet.contains(5));
        myHashSet.display();

         */
        CustomHashSet myHashSet = new CustomHashSet();
       // myHashSet.add(1);      // set = [1]
        myHashSet.display();

        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(1); // return True
        myHashSet.contains(3); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(2); // return True
        myHashSet.remove(2);   // set = [1]
        myHashSet.contains(2); // return False, (already removed)
        myHashSet.display();


    }
}
