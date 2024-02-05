package easy.firstUniqueCharacterInAString387;

class Solution {
    public int firstUniqChar(String s) {
        int[] c = new int[128];
        char[] str = s.toCharArray();

        for (char i : str) {
            c[i]++;
        }

        for (int i = 0; i < str.length; i++) {
            if (c[str[i]] == 1) return i;
        }

        return -1;
    }
}