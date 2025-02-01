public class SortColors {

    // time complexity : O(n), with single pass we sort the colors in place .
    // space complexity : O(1), constant space is used.

    // summary : three colors are there red, white and blue i.e 0, 1, 2 in values, sort nums array increasingly.
              // used three different var, one that is low for red of value 0 is fixed to be in left then movable var 
              // mid which moves from start to end checking which color it is and adjust accordingly used for white val 1
              // then last that is right for the blue color since it it is always be adjusted right because of val 2.
              // iterate through nums, comparing then updating values in place.
              
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while(mid <= right) {
            if(nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;

                mid++;
                left++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;

            }
        }
        
    }
    
}
