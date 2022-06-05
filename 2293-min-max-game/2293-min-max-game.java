class Solution{
public int minMaxGame(int[] a) {
    for(int len= a.length; len>1 ; len-=(len/2)){
        for(int i=0;i<len/2;i++) 
		    a[i]= (i%2)==1? Math.max(a[2 * i], a[2 * i + 1]) : Math.min(a[2 * i], a[2 * i + 1]);   
    }
    return a[0];
}
}