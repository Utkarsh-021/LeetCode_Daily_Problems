class Solution {
    public int distributeCookies(int[] a, int K) {
        int n = a.length;
        int[] h = new int[1<<n];
        for(int i = 1;i < 1<<n;i++){
            h[i] = h[i&i-1] + a[Integer.numberOfTrailingZeros(i)];
        }
        int[] dp = new int[1<<n];
        Arrays.fill(dp, 99999999);
        dp[0] = 0;
        for(int i = 0;i < K;i++){
        int[] ndp = new int[1<<n];
        Arrays.fill(ndp, 99999999);
            for(int j = 0;j < 1<<n;j++){
                for(int k = 1;k < 1<<n;k++){
                    if((j&k) == 0){
                        ndp[j|k] = Math.min(ndp[j|k], Math.max(dp[j], h[k]));
                    }
                }
            }
            dp = ndp;
        }
        return dp[(1<<n)-1];
    }
}