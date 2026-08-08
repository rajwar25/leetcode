class Solution {
    public void moveZeroes(int[] nums) {
        int k=-1;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==0)
           {
            k=i;
            break;
           }
        }
        int temp;
        for(int j=k+1;j<nums.length;j++)
        {
            if(k!=-1)
            {
            if(nums[j]!=0)
            {
               temp=nums[j];
               nums[j]=nums[k];
               nums[k]=temp;
               k++;
            }
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(" "+nums[i]);
        }
    }
}