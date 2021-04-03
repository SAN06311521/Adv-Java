import java.util.ArrayList;


//program for array list and it's method - add and remove
public class ArrayListDemo {
        public static void main(String args[]) {
            ArrayList<String> al = new ArrayList<String>();   //creation of array list.
            System.out.println("Initial size of al: " + al.size()); // to determine size of array
            al.add("S"); // add method use to add an element
            al.add("A");
            al.add("N");
            al.add("Y");  //for adding an element in array list
            al.add("A");
            System.out.println("Size of al after addition: " + al.size());
            System.out.println("Contents of al: " + al);
        }
}
