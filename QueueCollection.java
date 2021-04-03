import java.util.*;

class QueueCollection {
    public static void main(String args[]) {
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();

        p.add(1);
        p.add(2);
        p.add(3);

        System.out.println(p.peek());  //printing the top

        System.out.println(p.poll());  //removing the top

        System.out.println(p.peek());
    }
}
