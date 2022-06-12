class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int n = grid.length, m = grid[0].length;
        int[][] dp = new int[n][m];
        for(int i = 0;i < n;i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE / 2);
        }
        for(int i = 0;i < m;i++){
            dp[0][i] = grid[0][i];
        }
        for(int i = 0;i < n-1;i++){
            for(int j = 0;j < m;j++){
                for(int k = 0;k < m;k++){
                    dp[i+1][k] = Math.min(dp[i+1][k], dp[i][j] + moveCost[grid[i][j]][k] + grid[i+1][k]);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int v : dp[n-1]){
            min = Math.min(min, v);
        }
        return min;
    }
}