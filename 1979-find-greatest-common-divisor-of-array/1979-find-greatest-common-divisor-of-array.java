class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int minn=100000,maxx=-10000;
        for(int i:nums){
            if(i>maxx)maxx=i;
            if(i<minn)minn=i;
        }
        return gcd(minn,maxx);
    }
}