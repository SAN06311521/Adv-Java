import java.util.*;

public class LinkedListGetSet {
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
        ll.add(".");
        ll.add(0, "C");
        ll.addLast( "&");
        ll.addFirst( "@");
        System.out.println("Content before removal: " + ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Content after removal: " + ll);

        //get and set a value
        String val = ll.get(8);
        ll.set(8, val + "!");
        System.out.println("ll after get and set: " + ll);
    }
}



