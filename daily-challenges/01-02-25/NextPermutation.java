public class NextPermutation {
    
    // time complexity : O(n), three loops running each for only once to iterate over nums array.
    // space complexity : O(1), only constant extra space is used.

    // summary : concepts of permutations - what is it, how to get it and relations to get total numbers
              // wherever depended on numbers. meaning of lexicography, logic of next.
              // It is optimized version of brute force that includes three steps - 1. get permutations of array
              // (can use recursion to get it), 2. search linearly in that permutations bucket when found return next of it.
              // time complexity would be O(n * n!), n! is the total permutation can get and n is total elements to travese while comparing and do operations.
              // space complexity would be O(n!) using stack memory due to recursion, recursion tree depends upon length while getting permutaions.
              // In this just splits problem into 3 parts - find breaking point of longest common substring
              // then swap it with next smllaest largest number than val at breaking point from right side.
              // then just reverse the elements after swapping if necessary. incase no breaking point, return reverse of nums directly.

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for(int j = n - 1; j > index; j--) {
            if(nums[j] > nums[index]) {
                int temp = nums[j];
                nums[j] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        reverse(nums, index + 1, n - 1);
        
    }

    private void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

}