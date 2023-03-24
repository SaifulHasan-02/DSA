package Comparator;

import java.util.Comparator;

public class RollComparator implements Comparator<Student> {
    public int compare(Student s1,Student s2){
        return s1.roll - s2.roll;
    }
}
