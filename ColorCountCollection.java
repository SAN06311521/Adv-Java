import java.util.*;

//Program for counting the frequency of elements using collections.

class ColorCountCollection {
    public static void main(String args[]){
        List<String> list = Arrays.asList("Red", "Blue", "Green", "Blue", "Blue", "Red", "Black", "Black", "Black", "Black");
        HashSet<String> freqList = new HashSet<>(list);
        for(String s : freqList) {
            System.out.println(s + " : " + Collections.frequency(list, s));
        }
    }
}