import java.util.*;

public class IteratorCollection {
    public static void main(String args[]) {
        List<Integer> l = new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);

        List<Integer> ll = new LinkedList<Integer>();
        ll.add(8);
        ll.add(9);
        ll.add(10);

        for (int a:l) {
            for (int b : ll) {
                if (a < b)
                    System.out.print(a + " ");
            }
        }
    }
}
