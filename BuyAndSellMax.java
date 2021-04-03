import java.util.*;

public class BuyAndSellMax {
    public static int maxProfit(int a[]) {
        int profit = 0;
        for(int i = 1; i < a.length; i++) {
            if(a[i-1] < a[i]) {
                profit += (a[i] - a[i - 1]);
            }
        }
        return profit;
    }

    public static void main(String args[]) {
        int a[] = {5, 2, 6, 1, 4, 7, 3, 6};
        int result = maxProfit(a);
        System.out.println(result);
    }
}
