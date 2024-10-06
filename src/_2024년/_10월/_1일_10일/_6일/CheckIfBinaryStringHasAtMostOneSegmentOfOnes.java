class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    public boolean kLengthApart(int[] nums, int k) {
        int distinct = -1;

        for(int num : nums) {
            if(num == 1) {
                if(distinct == -1) {
                    distinct = 0;
                    continue;
                }
                if(distinct < k) return false;
                distinct = 0;
            }

            if(num == 0 && distinct != -1) distinct++;
        }

        return true;
    }
}