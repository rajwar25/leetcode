class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lst=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        int k;
        int j;
        int l;
        long sum=0;
        for(int i=0;i<n;i++)
        {
          if(i>0 && nums[i]==nums[i-1])
          {
            continue;
          }
          j=i+1;
          while(j<n)
          {
             if(j>i+1 && nums[j]==nums[j-1])
             {
                j++;
                continue;
             }
             k=j+1;
             l=n-1;
             while(k<l)
             {
               sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
               if(sum==target)
               {
                List<Integer> Temp= Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                    lst.add(Temp);
                    k++;
                    l--;
                   while(k<l && nums[k]==nums[k-1]) k++;
                   while(k<l && nums[l]==nums[l+1])l--;
               }
             
             else if(sum<target)
             {
                k++;
             }
             else{
                l--;
             }
             }
             j++;
          }
        }
        return lst;
    }
}