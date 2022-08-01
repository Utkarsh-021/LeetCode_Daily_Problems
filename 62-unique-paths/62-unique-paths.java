public class Solution {
    public int uniquePaths(int m, int n) {
        return helperFunction(m-1,n-1,new int[n][m]);
    }
    
    public int helperFunction(int m,int n,int[][] arr){
        if(m<0 || n<0) return 0;
        else if(m==0 || n==0) return 1;
        else if(arr[n][m]>0) return arr[n][m];
        else {arr[n][m]=helperFunction(m-1,n,arr)+helperFunction(m,n-1,arr);
        return arr[n][m];}
    }
}