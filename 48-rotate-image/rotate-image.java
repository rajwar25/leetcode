class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(i!=j)
                {
                  temp=matrix[i][j];
                  matrix[i][j]=matrix[j][i];
                  matrix[j][i]=temp;
                }
            }
        }
        int k;
        int temp2;
        for(int i=0;i<n;i++)
        {
            k=n-1;
            for(int j=0;j<n/2;j++)
            {
                  
                  temp=matrix[i][k];
                  matrix[i][k]=matrix[i][j];
                  matrix[i][j]=temp;
                  k--;
            }
        }
         for(int i=0;i<n;i++)
        { 
        for(int j=0;j<n;j++)
        {
            System.out.print(" "+matrix[i][j]);
        }
        System.out.println();
    }    
    }
}