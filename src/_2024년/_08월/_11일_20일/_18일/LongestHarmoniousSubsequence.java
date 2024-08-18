class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        int max = 0;
        Map<Integer,Integer> m = new HashMap<>();

        for(int num : nums) {
            int value = 1;
            if(m.containsKey(num)) {
                value += m.get(num);
            }
            m.put(num, value);
        }

        for(int key : m.keySet()) {
            if(m.containsKey(key+1))
            {
                max = Math.max(max, m.get(key) + m.get(key+1));
            }
        }

        return max;
    }
}