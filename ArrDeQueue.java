import java.util.*;

public class ArrDeQueue {
    public static void main(String[] args) {
        ArrayDeque<String> a = new ArrayDeque<String>();
        a.push("A");
        a.push("B"); //push method to add elements
        a.push("C");
        a.push("D");
        a.push("E");
        a.push("F");
        a.push("G");
        System.out.println("Content: " + a);
    }
}


