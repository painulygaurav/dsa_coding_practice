import java.util.HashSet;

public class A_ContainsDuplicate_217 {
    /**
     * Question:
     * Given an integer array "nums", return true if any value appears at least twice in the array, and return
     * 'false' if every element is distinct.
     */
    public static void main(String[] args){
        int[] nums = {1,4,3,5,4};

        System.out.println(containsDuplicate(nums));
    }

    /**
     * Brute Force Approach
     * Time complexity = O(n^2)
     * Space complexity = O(1)
     * @param nums array of integers
     * @return boolean true if array contains any duplicate else false
     */
    static boolean containsDuplicateBruteForce(int[] nums) {
        for (int i : nums){
            for (int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Using HashSet
     * Time complexity = O(n)
     * Space Complexity = O(n)
     * @param nums array of integers
     * @return boolean true if array contains any duplicate else false
     */
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsHashSet = new HashSet<>();
        for (int i : nums){
            if(numsHashSet.contains(i)){
                return true;
            }
            numsHashSet.add(i);
        }
        return false;
    }
}