import java.util.Arrays;

public class ClimbingStairs {
    // time complexity : O(n), since using single loop performs constant work at each iteration
    // space complexity : O(1), used constant space as few varibles .

    // summary : question states that either 1 or 2 steps at once means as doing dry get to find the 
    // relation that for n == 1, 2 returns same and afterward are just sum of the previously steps taken
    public int climbStairs1(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        int prev1 = 2, prev2 = 1;

        for(int i = 3; i <= n; i++) {
            int temp = prev1 + prev2;
            prev2 = prev1;
            prev1 = temp;
        }

        return prev1;
        
    }


    // time complexity : O(n) since each subproblem is solved once and then put it the memo arrray.
    // space complexity : O(n) ~ overall , since use memo array of size n + 1 to store results of subarray
    // also call stack requires space proportional to n.

    // summary : using recursion to solve the problem and use dp array to optimized it from O(2^n) to O(n) avoid
    // repeat calculations to do it again. At each recursive call in array store the total path of that particular n and 
    // if in future reuirements can use it based on the conditions I used to do.
    public int climbStairs2(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        return getTotalWays(n, memo);
    }

    private int getTotalWays(int n, int[] memo) {
        if(n == 1 || n == 2) return n;

        if (memo[n] != -1) return memo[n];

        memo[n] = getTotalWays(n - 1, memo) + getTotalWays(n - 2, memo);

        return memo[n];
    }
}