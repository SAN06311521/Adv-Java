import java.util.*;

public class LinkedListAdd {
    public static void main(String[] args) {
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
        ll.addLast( "&");
        ll.addFirst( "@");
        System.out.println("Content: " + ll);

    }
}

