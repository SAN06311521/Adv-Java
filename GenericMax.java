import java.util.*;

public class GenericMax {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; //initial assumption
        if ( y.compareTo( max ) > 0) {
            max = y;
        }
        if(z.compareTo( max ) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum among integer values is : ");
        System.out.println(maximum(3, 4, 5));
        System.out.println("Maximum among double values : ");
        System.out.println(maximum(3.3, 4.4, 1.1));
        System.out.println("Maximum of chars : ");
        System.out.println(maximum("pear", "apple", "orange"));
    }
}
