import java.util.*;

public class PriorityQueueCollection {
    public static void main(String args[]) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        System.out.println("head/top : " + queue.element());
        System.out.println("head/peek : " + queue.peek());
        System.out.println("iterating the queue elements : ");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();  //removing element
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
