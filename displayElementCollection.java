//program to display elements of toys.java having arraylist as one of it's method

import java.lang.reflect.Array;
import java.util.*;

public class displayElementCollection {
    public static void main(String[] args) {
        ArrayList<Toys> l = new ArrayList<Toys>();
        Toys t1 = new Toys( "Teddy",1, new ArrayList<String>(Arrays.asList("Red", "White", "Cream")));
        l.add(t1);
        l.add(new Toys("Football", 2, new ArrayList<String>(Arrays.asList("Black", "White", "Green", "Red"))));
        Toys t2 = new Toys();
        t2.setId(3);
        t2.setName("Rapunzel");
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Pink");
        c1.add("White");
        c1.add("Blue");
        t2.setColor(c1);
        l.add(t2);
        System.out.println("Printing the list : ");
        for(Toys t : l) {
            System.out.println(t);
        }
    }
}
