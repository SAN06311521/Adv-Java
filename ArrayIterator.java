import java.util.*;

public class ArrayIterator {
    public static void main(String args[]) {
        ArrayList al = new ArrayList();   //non-generic
        al.add(123);
        al.add('C');
        al.add("C++");
        al.add(true);
        al.add(49.29);
        Iterator itr = al.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");  //iterator method
        }

        ///for(Object obj : al) {
        //System.out.println(obj.toString()); //normal method
        //}
    }
}
