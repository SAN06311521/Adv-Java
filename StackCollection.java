import java.util.*;

public class StackCollection {
    public static void main(String args[]) {
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        Iterator<String> itr = stack.iterator();  //iterator declaring

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
