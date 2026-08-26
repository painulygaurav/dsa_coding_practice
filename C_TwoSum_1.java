import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C_TwoSum_1 {
    /**
     * Leet code 1 Two sum
     * Given an array of integers nums and an integer targer, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * Solution: Using hashmap, look back, and check if complement exist in the HashMap
     * @param nums : Array of integers
     * @param target : An integer that will equal to the sum of two elements in the array
     * @return int[] : It returns the indices of the two elements that sum result in the target integer
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    static int[] findTwoSum(int[] nums, int target){
        // this HashMap will maintain all the seen numbers and it's index
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(numToIndex.containsKey(complement)){
                return new int[] {numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i],i);
        }
        return new int[] {};
    }

    public static void main(String[] args){
        int target = 8;
        int[] nums = {15,3,11,5};
        System.out.println(Arrays.toString(findTwoSum(nums, target)));
    }
}
