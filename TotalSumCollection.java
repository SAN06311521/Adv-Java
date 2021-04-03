import java.util.*;

public class TotalSumCollection {
    public static void main(String[] args) {
        Number[] numbers = {1, 2, 3, 4, 4.1, 5.3};
        ArrayList<Number> numberList = new ArrayList<>();
        for (Number element : numbers) {
            numberList.add( element );
        }
        System.out.println(sum(numberList));
    }

    public static double sum (ArrayList<Number> list) {
        double total = 0;
        for( Number element : list) {
            total += element.doubleValue();
        }
        return total;
    }
}
