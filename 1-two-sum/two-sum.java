class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int c1=0;
        int c2=0;
        int rem;
        for(int i=0;i<nums.length;i++)
        {
            rem=target-nums[i];
            if(map.containsKey(rem))
            {
                c1=map.get(rem);
                c2=i;
                break;
            }
            map.put(nums[i],i);
        }
        return new int[]{c2,c1};
    }
}