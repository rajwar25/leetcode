class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int j=n-1;j>=0;j--)
        {
            if(digits[j]!=9)
            {
                digits[j]+=1;
                return digits;
            }
            digits[j]=0;
        }
        int ans[]=new int[n+1];
        ans[0]=1;
        return ans;
    }
}