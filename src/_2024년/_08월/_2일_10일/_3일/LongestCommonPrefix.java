class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";

        for(int i=0; i<200; i++) {
            if(strs[0].length() < i+1) {
                return ans;
            }
            char now = strs[0].charAt(i);

            for(String str : strs) {
                if(str.length() < i+1 || str.charAt(i) != now) {
                    return ans;
                }
            }

            ans += now;
        }

        return ans;
    }
}