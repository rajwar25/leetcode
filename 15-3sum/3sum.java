class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int k=n-1;
        int sum=0;
        int j;
        List<List<Integer>> lst=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
           if(i>0 && nums[i]==nums[i-1])
           {
            continue;
           }
           j=i+1;
           k=n-1;
           while(j<k)
           {
             sum=nums[i]+nums[j]+nums[k];
             if(sum==0)
             {
                List<Integer> Temp= Arrays.asList(nums[i],nums[j],nums[k]);
                 lst.add(Temp);
                 j++;
                 k--;
                 while(j<k && nums[j]==nums[j-1]) j++;
                 while(j<k && nums[k]==nums[k+1]) k--;
             }
             else if(sum<0)
             {
                j++;
             }
             else{
                k--;
             }

           }
        }
        return lst;
    }
}