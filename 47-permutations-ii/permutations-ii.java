class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>> lt=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        Arrays.sort(nums);
        permutation(lt,nums,new ArrayList<>(),used);
        return lt;
    }
    public void permutation( List<List<Integer>> lt, int arr[], List<Integer> ds,boolean used[])
    {
        if(ds.size()==arr.length)
        {
            lt.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(used[i])
            {
                continue;
            }
            if(i>0 && arr[i]==arr[i-1] && !used[i-1])
            {
            continue;
            }
            used[i]=true;
            ds.add(arr[i]);
            permutation(lt,arr,ds,used);

            ds.remove(ds.size()-1);
            used[i]=false;
        }
    }
}