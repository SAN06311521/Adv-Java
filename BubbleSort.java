import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you wanna have in your array : ");
        int n = input.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the number of elements: ");
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        for(int j = 0; j < n-1; j++) {
            boolean swapped = false;
            for(int k = 0; k < n-j-1; k++) {
                if(a[k+1] < a[k]) {
                    swapped = true;
                    int temp = a[k];
                    a[k] = a[k+1];
                    a[k+1] = temp;
                }
            }
            if(!swapped) {
                break;
            }
        }
        System.out.println("Sorted array using bubble sort : ");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
