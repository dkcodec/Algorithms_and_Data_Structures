package DFS_BFS;

import java.util.*;
public class problem4 {
    static class Item {
        int weight;
        int value;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }

    static class Knapsack {
        static int knapsack(Item[] items, int maxWeight) {
            int n = items.length;
            int[][] dp = new int[n + 1][maxWeight + 1];

            for (int i = 1; i <= n; i++) {
                for (int w = 1; w <= maxWeight; w++) {
                    if (items[i - 1].weight > w) {
                        dp[i][w] = dp[i - 1][w];
                    } else {
                        dp[i][w] = Math.max(dp[i - 1][w], items[i - 1].value + dp[i - 1][w - items[i - 1].weight]);
                    }
                }
            }

            return dp[n][maxWeight];
        }

        public static void main(String[] args) {
            Item[] items = new Item[] {
                    new Item(3, 10),
                    new Item(1, 1),
                    new Item(2, 9),
                    new Item(2, 5),
                    new Item(1, 6),
            };

            int maxWeight = 6;

            int maxValue = knapsack(items, maxWeight);
            System.out.println("Maximum value: " + maxValue);
        }
    }

}
