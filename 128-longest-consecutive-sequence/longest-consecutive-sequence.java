class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            st.add(nums[i]);
        }
        int cnt=0;
        int x=0;
        int lon=0;
        for(int it:st)
        {
            if(!st.contains(it-1))
            {
                cnt=1;
                x=it;
                while(st.contains(x+1))
                {
                    x=x+1;
                    cnt++;
                }
            }
            lon=Math.max(lon,cnt);
        }
        return lon;
    }
}