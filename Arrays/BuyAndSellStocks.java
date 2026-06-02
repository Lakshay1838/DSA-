import java.util.*;

public class BuyAndSellStocks {
    public static int maxProfitBruteForce(int[] prices) {
        int maxProfit = 0;
        int mini = Integer.MAX_VALUE;
        int n = prices.length;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }

        return maxProfit;
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int mini = Integer.MAX_VALUE;
        int n = prices.length;

        for(int i=0; i<n; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - mini);
            mini = Math.min(mini, prices[i]);
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int arr1[] = {7,6,4,3,1};

        System.out.println(maxProfit(arr));
        System.out.println(maxProfit(arr1));
        System.out.println(maxProfitBruteForce(arr));
        System.out.println(maxProfitBruteForce(arr1));

    }
}