class Solution {
    public int addDigits(int num) {
        /*
        using loop
        int sum=0;
        while(num>0){
            sum+=num%10;
            num=num/10;
            if(sum%100>9 && num==0){
                num=sum;
                sum=0;
            }
        } 
        return sum;
        */
        if(num==0) return 0;
        else return num%9==0 ? 9:num%9;
    }
}