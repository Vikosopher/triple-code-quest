import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

    // time complexity : O(n * n), traverse through number and at each level finding correct val for that place and removing it.
    // space complexity : O(n), using number to store val as well as string ans to store val => O(n) + O(n).

    // summary : the brute approach that comes to mind is to generate all permutations store it in the bucket and then 
    // return the val at k - 1 index in the bucket, time comeplxity will be O( n! * n), space complexity is O(n! * n) + O(n) so optimize it
    // got idea to use the value of k since we know there are n! permutation are there for n in different order selection, excluding each at once
    // to get the next correct value by changing fact and k values .
    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> number = new ArrayList<>();
        for(int i = 1; i < n; i++) {
            fact *= i;
            number.add(i);
        }
        number.add(n);

        String ans = "";
        k = k - 1;

        while(true) {
            ans += number.get(k / fact);
            number.remove(k / fact);
            if(number.size() == 0) break;

            k = k % fact;
            fact = fact / number.size();
        }

        return ans;
    }
}
