//Program to display id of students in order

import java.util.*;

public class StudentIdOrder {
    public static void main(String[] args) {
        LinkedHashSet<Integer> inOrderList = new LinkedHashSet<>();
        inOrderList.add(1);
        inOrderList.add(2);
        inOrderList.add(3);
        inOrderList.add(4);
        inOrderList.add(3); //this will not be added as it exists already
        inOrderList.add(5);
        System.out.println("Id of students in order is printed using LinkedHashSet : ");
        System.out.println(inOrderList);
    }
}
