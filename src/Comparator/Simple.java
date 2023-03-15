package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Simple {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1,"Saiful","kol"));
        list.add(new Student(3,"Chinu","bgp"));
        list.add(new Student(2,"Vikash","patna"));
        list.add(new Student(5,"Yash","agra"));
        list.add(new Student(4,"Adarsh","goa"));
        //Original list
        for (Student s:list) {
            System.out.println(s.roll+" "+s.name+" "+s.add);
        }
        System.out.println();
        //Sort according to name
        Collections.sort(list,new NameComparator());
        for (Student s:list) {
            System.out.println(s.roll+" "+s.name+" "+s.add);
        }
        System.out.println();
        //sort according to roll
        Collections.sort(list,new RollComparator());
        for (Student s:list) {
            System.out.println(s.roll+" "+s.name+" "+s.add);
        }
        //sort according to add
        System.out.println();
        Collections.sort(list, new Comparator<Student>(){
            public int compare(Student s1,Student s2){
                return s1.add.compareTo(s2.add);
            }
        });
        for (Student s:list) {
            System.out.println(s.roll+" "+s.name+" "+s.add);
        }


    }
}
