class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> ans = new ArrayList<>();
        combination(0, new ArrayList<>(), candidates, target, ans);
        return ans;
    }
     public void combination( int indx, List<Integer> ds, int[] cd, int k, List<List<Integer>> ans)
     {
        if(indx==cd.length)
        {
        if(k==0)
        {
           ans.add(new ArrayList<>(ds));
        }
        return;
        }
        if(cd[indx]<=k)
        {
          ds.add(cd[indx]);
          combination(indx,ds,cd,k-cd[indx],ans);
          ds.remove(ds.size()-1);
        }
        combination(indx+1,ds,cd,k,ans);
     }
}