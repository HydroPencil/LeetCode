package easy.uniqueNumberOfOccurrences1207;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] value = new int[2001];
        for(int i : arr){
            value[i+1000]++;
        }
        Map<Integer,Integer> m = new HashMap<>();
        int kind = 0;
        for(int i=0; i<value.length; i++){
            if(value[i]!=0){
                m.put(value[i],i);
                kind++;
            }
        }
        return kind==m.values().size();
    }
}