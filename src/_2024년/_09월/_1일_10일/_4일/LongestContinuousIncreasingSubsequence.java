class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums)
    {
        int max = 0;
        Stack<Integer> st = new Stack<>();
        st.push(nums[0]);

        for(int i=1; i<nums.length; i++) {
            if(st.peek() < nums[i]) {
                st.push(nums[i]);
            } else {
                max = Math.max(max, st.size());
                st.clear();
                st.push(nums[i]);
            }
        }

        max = Math.max(max, st.size());

        return max;
    }
}