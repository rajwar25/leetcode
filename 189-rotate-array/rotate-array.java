class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int stt=0;
        k=k%n;
        k=n-k;
        int end=k-1;
        int temp;
        while(end>=stt)
        {
            temp=nums[stt];
            nums[stt]=nums[end];
            nums[end]=temp;
            stt++;
            end--;

        }
        int sttt=k;
        int endd=n-1;
        while(sttt<endd)
        {
           temp=nums[sttt];
            nums[sttt]=nums[endd];
            nums[endd]=temp;
            sttt++;
            endd--; 
        }
        int j=n-1;
        for(int i=0;i<n/2;i++)
        {
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+nums[i]);
        }

    }
}