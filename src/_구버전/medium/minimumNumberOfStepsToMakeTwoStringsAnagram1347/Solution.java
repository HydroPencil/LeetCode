package medium.minimumNumberOfStepsToMakeTwoStringsAnagram1347;

class Solution {
    public int minSteps(String s, String t) {
        Map<Character, Integer> c = new HashMap<>();
        char[] sC = s.toCharArray();
        char[] tC = t.toCharArray();

        for(char i : tC){
            if(c.containsKey(i)){
                Integer value = c.get(i) + 1;
                c.replace(i, value);
                continue;
            }
            c.put(i, 1);
        }
        for(char i : sC){
            if(c.containsKey(i)){
                Integer value = c.get(i)-1;
                if(value == 0) c.remove(i);
                else c.replace(i, value);
            }
        }

        int ans = 0;
        for(Integer value : c.values()){
            ans += value;
        }

        return ans;
    }
}