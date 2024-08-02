package medium.sortCharactersByFrequency451;

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> store = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            int v = 1;
            if (store.containsKey(c)) {
                v += store.get(c);
            }
            store.put(c, v);
        }

        List<Character> keySet = new ArrayList<>(store.keySet());
        keySet.sort((o1, o2) -> store.get(o2).compareTo(store.get(o1)));

        StringBuilder ans = new StringBuilder();
        for (Character c : keySet) {
            for (int i = 0; i < store.get(c); i++) {
                ans.append(c);
            }
        }

        return ans.toString();
    }
}