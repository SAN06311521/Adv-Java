import java.util.*;

class ArrayMethodCollection {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 1; i <= 5; i++)
            al.add(i);   //adding element

        System.out.println(al);

        al.remove(1);

        System.out.println("After deletion " + al);

        System.out.print("Printing element via get method: ");
        for (int i = 0; i < al.size(); i++)    //printing element one by one
            System.out.print(al.get(i) + " ");   //size and get method
    }
}
