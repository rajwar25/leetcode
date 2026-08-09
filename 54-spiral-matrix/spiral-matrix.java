class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0;
        int right=m-1;
        int bottom=n-1;
        int top=0;
        List<Integer> lst=new ArrayList<>();
        while(left<=right &&  bottom >=top)
        {
            for(int i=left;i<=right;i++)
            {
                lst.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++)
            {
               lst.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom)
            {
            for(int k=right;k>=left;k--)
            {
                lst.add(matrix[bottom][k]);
            }
            bottom--;
            }
            if(left<=right)
            {
            for(int l=bottom;l>=top;l--)
            {
                lst.add(matrix[l][left]);
            }
            left++;
            }
        }
        return lst;
    }
}