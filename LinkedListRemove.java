import java.util.*;

public class LinkedListRemove {
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
        ll.add("#");
        System.out.println("Content before removal: " + ll);
        ll.remove("#");
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Content after removal: " + ll);

    }
}


