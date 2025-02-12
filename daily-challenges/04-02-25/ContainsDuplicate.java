import java.util.HashSet;

public class ContainsDuplicate {

    // time complexity : O(n), loop iterates over the elements of array once 
    // and contains-add of set methods takes constant time for average cases so overall it is given

    // space complexity : O(n), using hashset ds and it stores all elements of array in worst case

    // summary : first approach that comes to mind is to apply two loops one for the counter and other 
    // for comparing to its previous and solve accordingly - O(n^2), then thought of sorting the array using
    // inbuilt methods and then comapring with its previous ones - O(n log(n)) and optimizing it to O(n),
    // thought of using set ds since it stores only unique elements and doing operations on it takes constant time in general.
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> bucket = new HashSet<>();

        for(int num : nums) {
            if(bucket.contains(num)) {
                return true;
            }
            bucket.add(num);
        }

        return false;
    }
    
}
