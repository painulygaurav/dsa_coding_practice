import java.util.HashSet;
import java.util.Arrays;

public class A_ContainsDuplicate_217 {
    /**
     * Question:
     * Given an integer array "nums", return true if any value appears at least twice in the array, and return
     * 'false' if every element is distinct.
     * Constraint:
     * 1 <= nums.length <= 10^5
     * -10^9 <= nums[i] <= 10^9
     */
    public static void main(String[] args){
        int[] nums = {1,4,3,5,1};

        System.out.println(containsDuplicateOptimal(nums));
    }

    /**
     *
     * Time complexity = O(n^2)
     */
    static Boolean containsDuplicateBruteForce(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Time complexity = O(n log n)
     * Total time = n logn + n.
     * Since n log n is the higher degree term we are going to consider it. Hence the time complexity O(nlogn)
     */
    static Boolean containsDuplicateSubOptimal(int[] nums){
        Arrays.sort(nums); // O(n log n)
        for(int i = 0; i < nums.length - 1; i++){ //O(n)
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
    /**
     * Time complexity = O(n)
     */
    static Boolean containsDuplicateOptimal(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num))
                return true;
        }
        return false;
    }


}