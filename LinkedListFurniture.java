import java.util.*;

public class LinkedListFurniture {
    public static void main(String[] args) {
        Furniture f1 = new Furniture();
        f1.setName("Sofa");
        f1.setId(1);
        f1.setDesc("Multi Use");
        Furniture f2 = new Furniture();
        f2.setName("Chair");
        f2.setId(2);
        f2.setDesc("Tough and stiff");
        Furniture f3 = new Furniture();
        f3.setId(3);
        f3.setName("Table");
        f3.setDesc("Durable and shiny");
        Furniture f4 = new Furniture();
        f4.setId(4);
        f4.setName("Bed");
        f4.setDesc("Comfort and best");
        Furniture f5 = new Furniture();
        f5.setId(5);
        f5.setName("Cupboard");
        f5.setDesc("Spacious");
        Furniture f6 = new Furniture();
        f6.setId(6);
        f6.setName("Shelf");
        f6.setDesc("Clean");
        LinkedList<Furniture> listOfFurniture = new LinkedList<>();
        listOfFurniture.add(f1);
        listOfFurniture.add(f2);
        listOfFurniture.add(f6);
        int size = listOfFurniture.size();
        if(size < 2) {
            listOfFurniture.clear();
        }
        System.out.println("Size of first list is " + size);
        for(Furniture obj : listOfFurniture) {
            System.out.println(obj.getName() + " : " + obj.getId() + " : " + obj.getDesc());
        }
        LinkedList<Furniture> list = new LinkedList<>();
        list.add(f3);
        list.add(f4);
        list.add(f5);
        list.add(f1);
        int s = list.size();
        System.out.println("Size of second list before add all is " + s);
        listOfFurniture.addAll(list);
        int sizeOfList = listOfFurniture.size();
        System.out.println("Size of list : " + sizeOfList);
        if(sizeOfList < 2) {
            list.clear();
        }
        System.out.println("After applying addAll method");
        for(Furniture obj1 : listOfFurniture) {
            System.out.println(obj1.getName() + " : " + obj1.getId() + " : " + obj1.getDesc());
        }
        list.remove(1);
        System.out.println("After applying remove method");
        for(Furniture obj2 : listOfFurniture) {
            System.out.println(obj2.getName() + " : " + obj2.getId() + " : " + obj2.getDesc());
        }
        list.retainAll(listOfFurniture);
        System.out.println("After applying retainAll method");
        for(Furniture obj3 : list) {
            System.out.println(obj3.getName() + " : " + obj3.getId() + " : " + obj3.getDesc());
        }

    }
}
