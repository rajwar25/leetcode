class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int slow=0;
        for(int fast=1;fast<n;fast++)
        {    
            if(nums[slow]!=nums[fast])
            {
                slow++;
               nums[slow]=nums[fast];//nums at slow=0 pe kuch value toh hai hi jo ki first value hai aur voh correctly placed hai so begin from 1
            }
        }
        return slow+1;
    }
}