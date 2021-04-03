import java.util.*;

public class HashMapChocolates {
    public static void main(String[] args) {
        HashMap<Chocolates, Integer> mapList = new HashMap<Chocolates, Integer>();
        Chocolates c1 = new Chocolates(1, "Dairy Milk");
        Chocolates c2 = new Chocolates(2, "KitKat");
        Chocolates c3 = new Chocolates(3, "Five Star");
        Chocolates c4 = new Chocolates(4,"Dark Chocolate");
        mapList.put(c1, 1);
        mapList.put(c2, 2);
        mapList.put(c3, 3);
        mapList.put(c4, 4);
        System.out.println("Size of the set is : " + mapList.size());   //size
        System.out.print("Elements of HashMap are : ");
        for( Integer i : mapList.values()) {   //display elements using values
            System.out.println(i);
        }
        for(Chocolates c : mapList.keySet()) {   //keySet
            System.out.println(c);
        }
        for(Chocolates c : mapList.keySet()) {         //keySet with values
            System.out.println(c + " : " + mapList.get(c));
        }
        System.out.println("Checking contains  : " + mapList.containsKey(1));
    }
}
