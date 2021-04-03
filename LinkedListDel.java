import java.util.*;

public class LinkedListDel {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<String>();

        //add element to linked list
        ll.add("h");
        ll.add("u");
        ll.add("n");
        ll.add("c");
        ll.add("h");
        ll.add("u");
        ll.add("n");
        ll.add(0, "C");
        ll.add(8, "&");
        ll.add(9, "@");
        System.out.println("Content before removal: " + ll);
        ll.remove(8);
        ll.remove("@");
        System.out.println("Content after removal: " + ll);

    }
}
