public class MergeSortedArray {

    // time complexity : O(m + n), since loop iterates through both array's elements once, comparing then putting it at correct index;
    // space complexity : O(1), since constant space is used.

    // Summary : both array elements are sorted in non - decreasing order means small to big. and for not using extra space and to
              // update nums1 array since it has len of m plus n. and method will print it at the execution of program.
              // start comparing from last of both arrays and put largest at the end of the nums1 array and then adjusting counter accordingly.
              // if nums2 array left with elements then put it directly in the nums1 array from the end to the start.
              
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex = nums1.length - 1;
        int pos1 = m - 1;
        int pos2 = n - 1;

        while(pos1 >= 0 && pos2 >= 0) {
            if(nums1[pos1] > nums2[pos2]) {
                nums1[lastIndex] = nums1[pos1];
                pos1--;
            } else {
                nums1[lastIndex] = nums2[pos2];
                pos2--;
            }

            lastIndex--;
        }

        while(pos2 >= 0) {
                nums1[lastIndex--] = nums2[pos2];
                pos2--;
        }
        
    }
}
