import java.util.*;

public class SortAlgoCollection {
    private static final String str[] = {"B", "A", "C"};

    public void printElements() {
        List<String> list = Arrays.asList(str);
        System.out.printf("Unsorted array : %s ", list);
        Collections.sort(list);
        System.out.println();
        System.out.printf("Sorted array : %s ", list);
    }

    public static void main(String[] args) {
        SortAlgoCollection s = new SortAlgoCollection();
        s.printElements();
    }
}
