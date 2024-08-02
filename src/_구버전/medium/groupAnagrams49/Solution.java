package medium.groupAnagrams49;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new LinkedList<>();
        HashMap<String, List<String>> words = new HashMap<>();

        for (String s : strs) {
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String key = new String(sArray);

            if (!words.containsKey(key)) {
                List<String> value = new LinkedList<>();
                value.add(s);
                words.put(key, value);
                continue;
            }
            words.get(key).add(s);
        }

        for (List<String> value : words.values()) {
            ans.add(value);
        }

        return ans;
    }
}