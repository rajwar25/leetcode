class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int el=-1;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
           if(cnt==0)
           {
            el=nums[i];
            cnt=1;
           }
           else if(nums[i]==el)
           {
            cnt++;
           }
           else{
            cnt--;
           }
        }
        int cnt2=0;
        for(int j=0;j<n;j++)
        {
            if(nums[j]==el)
            {
             cnt2++;
            }
        }
        if(cnt2>=n/2)
        {
            return el;
        }
        return -1;
    }
}