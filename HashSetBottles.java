import java.util.*;

public class HashSetBottles {
    public static void main(String[] args) {
        Bottle b1 = new Bottle();
        Bottle b2 = new Bottle();
        Bottle b3 = new Bottle();
        Bottle b4 = new Bottle();
        b1.setId(1);
        b1.setName("B1");
        b2.setId(2);
        b2.setName("B2");
        b3.setId(3);
        b3.setName("B3");
        b4.setId(4);
        b4.setName("B4");
        HashSet<Bottle> hs = new HashSet<Bottle>();
        hs.add(b1);
        hs.add(b2);
        hs.add(b3);
        hs.add(b4);
        for(Bottle obj : hs) {
            System.out.println("Elements of hashset is " + obj.getId() + " : " + obj.getName());
        }
        Object[] a = hs.toArray();
        System.out.println("The array is : ");     //doubt
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println("Hashcode value is " + hs.hashCode());
        System.out.println("Size of the set is " + hs.size());
        System.out.println("Is the set empty? " + hs.isEmpty());
        System.out.println("Check for contain method : " + hs.contains(b1));
        HashSet<Bottle> cloned = new HashSet<Bottle>();
        cloned = (HashSet)hs.clone();
        for(Bottle obj1 : cloned) {
            System.out.println(obj1.getId() + " : " + obj1.getName());
        }
    }
}
