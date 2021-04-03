import java.util.*;

public class ArrayListStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("John");
        s1.setId(1);
        Student s2 = new Student();
        s2.setName("Teddy");
        s2.setId(2);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        for(Student obj : list) {
            System.out.println(obj.getName() + " : " + obj.getId());
        }
    }
}
