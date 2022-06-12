class Solution {
    public long distinctNames(String[] ideas) {
        Map<String, Integer> map = new HashMap<>();
        for(String u : ideas){
            int f = u.charAt(0) - 'a';
            String rem = u.substring(1);
            map.merge(rem, 1<<f, Integer::sum);
        }
        List<Integer> l = new ArrayList<>(map.values());
        long ans = 0;
        for(int i = 0;i < 26;i++){
            for(int j = i+1;j < 26;j++){
                long a = 0, b = 0;
                for(int v : l){
                    if(v<<~i<0 && v<<~j>=0){
                        a++;
                    }
                    if(v<<~j<0 && v<<~i>=0){
                        b++;
                    }
                }
                ans += a*b;
            }
        }
        return ans*2;
    }
}