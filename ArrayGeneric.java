import java.util.*;

public class ArrayGeneric {
    public static void main(String[] args) {
        ArrayList<String> ag = new ArrayList<String>();   //generic
        ag.add("123");
        ag.add("C");
        ag.add("C++");
        ag.add("true");
        for(Object obj : ag) {
                System.out.println(obj.toString()); //normal method
        }
    }
}
