class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int j=0;j<nums.length;j++)
        {
            map.put(nums[j], map.getOrDefault(nums[j],0)+1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
         {
            if (entry.getValue() == 1) 
            {
                ans = entry.getKey();
                break;
            }
         } 
         return ans;
}
}