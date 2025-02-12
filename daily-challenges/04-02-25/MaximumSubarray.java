
public class MaximumSubarray {

    // time complexity : O(n), loop iterates over the array's elements once and others operation takes constant time.
    // space complexity : O(1), constant extra space is used through few variables.

    // summary : when i see the max Sub array problems, clicks to use kadane algo to maintains the state ongoingly.

    public int maxSubArray(int[] nums) {
        int largestSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int num : nums) {
            currSum += num;
            largestSum = Math.max(largestSum, currSum);
            if(currSum < 0) currSum = 0;
        }

        return largestSum;
    }
    
}
