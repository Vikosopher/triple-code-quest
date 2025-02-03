import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

    // time complexity : O(2^n), sorting the array takes initially O(n logn) then backtrack methods generating 2^n subsets and
    // each step list is being created for different sizes if we take it then O(n) -> O(n * 2 ^ n) orverall to bigger values 2 ^ n.

    // space complexity : O(2 ^ n * n) + O(n), using list data structure to store every sublist in the recursive tree that is total 2 ^ n of different sizes n 
    // also includes recursive tree that would go to the depth of the array size;

    // summary : if we breakdown the problems, first sort the array so to make duplicates adjacent ones to tackle problem at ease then find subsets of the array since duplicates are present then ignore on spot to get uniques
    // logic behind slipping duplicates via a condition inside a loop that compares it to the previous if value mataches then move ahead not to do anything
    // iterating through array elements and bactrack to every step to get all possible subsets store it in the lists to return at the last. 


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), result);
        return result;

    }

    private void backtrack(int index, int[] nums, List<Integer> pointer, List<List<Integer>> result) {
        result.add(new ArrayList<>(pointer));

        for(int i = index; i < nums.length; i++) {
            if(i != index && nums[i] == nums[i-1]) continue;

            pointer.add(nums[i]);
            backtrack(i + 1, nums, pointer, result);
            pointer.remove(pointer.size() - 1);
        }
    }
}