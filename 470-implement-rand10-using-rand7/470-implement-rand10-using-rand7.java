/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    public int rand10() {
        int index;
        //Try to run rand7() twice to get 49 combinations 7*7
        //then 49-> 40 (4 chances for each no in 1 to 10) + in case of 9 
        do{
        int temp1=rand7();
        int temp2=rand7();
        index=temp2+(temp1-1)*7;
    }while(index>40);
        return 1+(index-1)%10;
    }
}