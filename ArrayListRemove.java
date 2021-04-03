import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial size of al: " + al.size());
        al.add("S");
        al.add("a");
        al.add("n");
        al.add("y");
        al.add("a");
        al.add(" ");
        al.add(6, "J");
        System.out.println("Size of al after addition: " + al.size());
        System.out.println("Contents of al: " + al);
        al.remove("J"); // remove method to remove an element
        System.out.println("Content after removal: " + al);
    }
}
