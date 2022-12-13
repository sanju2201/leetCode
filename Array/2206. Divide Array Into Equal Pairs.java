class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i=i+2){
           if(nums[i] != nums[i+1]){
               return false;
           }
       } 
       return true;
    }
}

// https://leetcode.com/problems/divide-array-into-equal-pairs/description/
