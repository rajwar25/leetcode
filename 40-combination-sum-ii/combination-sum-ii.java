class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
         Arrays.sort(candidates);
         combination(ans,candidates,target, new ArrayList<>(),0);
         return ans;
    }
    public void combination(List<List<Integer>> ans, int arr[], int k, List<Integer>ds, int indx)
    {
        if(k==0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=indx;i<arr.length;i++)
        {
          if(i>indx && arr[i]==arr[i-1])
          {
            continue;
          }
          if(arr[i]>k)
          {
            break;
          }
          ds.add(arr[i]);
          combination(ans,arr,k-arr[i],ds,i+1);
          ds.remove(ds.size()-1);
        }
    }
}