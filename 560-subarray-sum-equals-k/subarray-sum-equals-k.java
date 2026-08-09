class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int sum=0;
       int cnt=0;
       for(int i=0;i<nums.length;i++) 
       {
          sum=sum+nums[i];
          if(sum==k)
          {
              cnt++;
          }
          int rem=sum-k;
          if(map.containsKey(rem))
          {
            cnt=cnt+map.get(rem);
          }
          map.put(sum, map.getOrDefault(sum, 0) + 1);
       }
       return cnt;
    }
}