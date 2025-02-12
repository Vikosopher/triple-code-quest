

public class FindMinimumInRotatedSortedArray {

    // time complexity : O(n log(n)), there is single iteration and on each interation array divides into halves.
    // space complexity : O(1), constant extra space is used as of few variables.

    // summary : whenever there is sorted first clicks binary search if cam apply or not ,
    // same applies here, since it is sorted and finding mid and comparing and halving the array
    // stops when both points to one means we got the minimum element and return it .
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while(left < right) {
            int mid = (left + right) >> 1;

            if(nums[mid] > nums[right]) left = mid + 1;
            else right = mid;
        }

        return nums[right];
        
    }
    
}
