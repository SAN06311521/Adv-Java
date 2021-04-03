import java.util.*;

class CollectionDemo {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4 }; //declaring an array
        Vector<Integer> v = new Vector<Integer>();   //declaring a vector
        Hashtable<Integer, String> h = new Hashtable<Integer, String>();   //declaring a hashtable
        v.addElement(1);  //adding an element in vector
        v.addElement(2);

        h.put(1, "mystic");  //adding an element hashtable
        h.put(2, "scribbler");

        System.out.println(arr[0]);
        System.out.println(v.elementAt(1));
        System.out.println(h.get(1));
        System.out.println(h.get(2));
    }
}
