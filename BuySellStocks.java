
//========================================
//
//      |
//      |
//    7 |*
//    6 |               *
//    5 |       *
//    4 |                   *
//    3 |           *
//    2 |   *
//    1_|________________________
//      |1  2   3   4   5   6   7
//          DAY -->
//
//=========================================
import java.util.*;

public class BuySellStocks {

    public static int stock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    // You are given an integer array prices where prices[i] is the price of a given
    // stock on the ith day.
    // On each day, you may decide to buy and/or sell the stock. You can only hold
    // at most one share of the stock at any time. However, you can buy it then
    // immediately sell it on the same day.
    // Find and return the maximum profit you can achieve

    public static int stock2(int prices[]) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    // You are given an array prices where prices[i] is the price of a given stock
    // on the ith day.
    // Find the maximum profit you can achieve. You may complete at most two
    // transactions.
    // Note: You may not engage in multiple transactions simultaneously (i.e., you
    // must sell the stock before you buy again).

    public static int stock3(int prices[]) {
        int buy1 = Integer.MAX_VALUE;
        int buy2 = Integer.MAX_VALUE;
        int profit1 = 0;
        int profit2 = 0;
        for (int i = 0; i < prices.length; i++) {
            buy1 = Math.min(buy1, prices[i]);
            profit1 = Math.max(profit1, prices[i] - buy1);
            buy2 = Math.min(buy2, prices[i] - profit1);
            profit2 = Math.max(profit2, prices[i] - buy2);
        }
        return profit2;
    }

    // You are given an integer array prices where prices[i] is the price of a given
    // stock on the ith day, and an integer k.
    // Find the maximum profit you can achieve. You may complete at most k
    // transactions: i.e. you may buy at most k times and sell at most k times.
    // Note: You may not engage in multiple transactions simultaneously (i.e., you
    // must sell the stock before you buy again).

    public static int stock4(int prices[], int k) {
        int n = prices.length;
        int dp[][] = new int[k + 1][n];
        for (int i = 1; i <= k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 1; j < n; j++) {
                if (dp[i - 1][j - 1] - prices[j - 1] > max) {
                    max = dp[i - 1][j - 1] - prices[j - 1];
                }
                if (max + prices[j] > dp[i][j - 1]) {
                    dp[i][j] = max + prices[j];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[k][n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Total Prices");
        int n = sc.nextInt();
        int prices[] = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter The Number Of Transactions");
        int k = sc.nextInt();
        System.out.println();
        System.out.println("Maximum Profit: " + stock(prices));
        System.out.println("Maximum Profit: " + stock2(prices));
        System.out.println("Maximum Profit: " + stock3(prices));
        System.out.println("Maximum Profit: " + stock4(prices, k));
    }
}
