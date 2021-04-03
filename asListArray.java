import java.util.*;

public class asListArray {
    public asListArray() {
        String colors[] = {"white", "blue", "black"};
        LinkedList <String> links = new LinkedList<String>(Arrays.asList(colors));
        links.addLast("orange");
        links.add("green");
        links.addFirst("purple");

        colors = links.toArray(new String[ links.size()] );
        System.out.println("Colors: ");
        for( String color : colors ) {
            System.out.println(color);
        }
    }

    public static void main(String[] args) {
        new asListArray();
    }
}
