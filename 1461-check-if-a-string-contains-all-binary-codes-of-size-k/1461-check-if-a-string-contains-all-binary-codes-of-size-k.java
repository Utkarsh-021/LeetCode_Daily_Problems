class Solution {
    public boolean hasAllCodes(String s, int k) {
        int counter=1<<k;
        Set<String> variables=new HashSet<String>();
        for(int i=k;i<=s.length();i++){
            String sub=s.substring(i-k,i);
            if(!variables.contains(sub)){
                counter--;
                variables.add(sub);
                
            if(counter==0){
                return true;
            }
            }
        }
        return false;
    }
}