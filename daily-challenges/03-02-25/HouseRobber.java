import java.util.Arrays;

public class HouseRobber {

    // time complexity : O(n), single loop runs, each subproblem is calculated once while iterating through nums
    // space compleity : O(n), use memo array of size(n + 1) also call stack will need space proportinal to n

    // summary : as questions states can not rob adjacent homes and return the maximum amount that can be get, so pick and
    // not pickup technique comes to mind and adjusts indexes accordingly. base case if index croos nums length just there
    // no house left to rob then return 0 as just.
    public int rob(int[] nums) {
        int[] memo = new int[nums.length + 1];
        Arrays.fill(memo, -1);
        return getMaxAmount(nums, 0, memo);
    }

    private int getMaxAmount(int[] nums, int index, int[] memo) {
        if(index >= nums.length) return 0;

        if(memo[index] != -1) return memo[index];

        int notRob = getMaxAmount(nums, index + 1, memo);
        int rob = nums[index] + getMaxAmount(nums, index + 2, memo);

        return memo[index] = Math.max(notRob, rob);
    }
    
}
