/*
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2 
*/

//O(n^2) solution
public class Solution {
    public int[] twoSum(int[] nums, int target) {
       int len = nums.length;
       for (int i = 0; i < len; i++) {
           for (int j = 0; j< len; j++) {
               if (nums[i] + nums[j] == target ) {
                   if (i ==j) {
                       continue;
                   }
                   return new int[]{i+1, j+1};
               }
           }
       }
       return new int[2];
    }
}

//O(n) solution
public class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> res = new HashMap<Integer, Integer>();
       int len = nums.length;
       for (int i = 0; i < len; i++) {
           if(res.containsKey(nums[i])) {
               return new int[]{res.get(nums[i]) + 1, i + 1};
           } else {
               res.put(target - nums[i], i);
           }
       }
       return new int[2];
    }
}
