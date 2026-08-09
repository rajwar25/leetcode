class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        int k=(n/3)+1;
         for(int i=0;i<nums.length;i++)
         {
           mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
           if(mp.get(nums[i])==k)
           {
            lst.add(nums[i]);
           }
         }
         return lst;
    }
}