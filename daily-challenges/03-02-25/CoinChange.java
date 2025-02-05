import java.util.Arrays;

public class CoinChange {

    // time complexity : O(m + n), where m is amount and n is no of coins, since each subProblem is calculated once
    // space complexity : O(n) n is the amount used by memo array to store

    // summary : Questions was not clicked in the starting and went through web info about the problem got to know the
    // meaning since each coins can be used multiple time and amount is given , we have to calculate coins for each amount 
    // from concepts since array is {1,2,5} and target is 11, then we go for 11 coins and get to know if availbe or can be get
    // then decresing the coins and storing the min coins that can be made using the amount and then comparing in the end and return it.

    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -1);

        int result = fewestCoins(coins,amount, memo);
        return result == Integer.MAX_VALUE ? -1 : result;

        
    }

    private int fewestCoins(int[] coins, int amount, int[] memo) {
        if(amount < 0) return Integer.MAX_VALUE;
        if(amount == 0) return 0;
        if(memo[amount] != -1) return memo[amount];
        
        int minCoins = Integer.MAX_VALUE;
        for(int coin : coins) {
            int res = fewestCoins(coins, amount - coin, memo);
            if(res != Integer.MAX_VALUE) {
                minCoins = Math.min(minCoins, res + 1);
            }
        }

        memo[amount] = minCoins;
        return memo[amount];
    }
}