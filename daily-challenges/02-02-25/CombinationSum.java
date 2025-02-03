import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    // time complexity : O(2 ^ t * k), 2^t is the number of subsets generated and 
    // k for the average length of each subset, contributing to the cost of copying each subset.

    // space complexity : O(k * x), k is the avg length of the subsets, x is the total number of generated subsets 2 ^ n.

    // summary : problem related to subsets and motive to find combinations clicks me to use recursion and to remember the
    // technique pick or not pick to solve the problem. since each val can be resused to get the target so condition to check
    // if the val at index is small or equal take it otherwise not pick up. base condition if reaches last index then
    // check if target is 0 means subsets found with sum equals target save it to the result.

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(candidates, 0, target, new ArrayList<>(), result);

        return result;
    }

    private void findCombinations(int[] candidates, int index, int target, List<Integer> temp, List<List<Integer>> result) {
        if(index == candidates.length) {
            if(target == 0) result.add(new ArrayList<>(temp));
            return;
        }

        if(candidates[index] <= target) {
            temp.add(candidates[index]);
            findCombinations(candidates, index, target - candidates[index], temp, result);
            temp.remove(temp.size() - 1);
        }

        findCombinations(candidates, index + 1, target, temp, result);
    }
    
}
