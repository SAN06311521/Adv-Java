import java.util.*;

public class GenericMethod {
    public static <E> void printArray( E[] inputArray) {  //defining generics
        for(E element : inputArray) {
            System.out.println(element);
        }
    }

    public static void main(String args[]) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        System.out.println("Array intArray contains: ");
        printArray(intArray);
        System.out.println("Array doubleArray contains: ");
        printArray(doubleArray);
        System.out.println("Array charArray contains: ");
        printArray(charArray);
    }
}
