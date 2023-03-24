package Basic;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
//        System.out.println(s1.rno);
        s1.setRno(12);
        s1.setName("Saiful");

        System.out.println(s1.getRno());
        System.out.println(s1.getName());
    }
}
