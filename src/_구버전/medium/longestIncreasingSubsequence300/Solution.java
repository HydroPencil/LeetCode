package medium.longestIncreasingSubsequence300;

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] subsequence = new int[nums.length];
        Arrays.fill(subsequence,0);
        int maxSize = 0;

        for(int i : nums){
            int low=0, high=maxSize;

            while(low != high){
                int mid = (low+high)/2;
                if(subsequence[mid] < i){
                    low = mid+1;
                } else {
                    high = mid;
                }
            }

            subsequence[low] = i;
            if(low==maxSize){
                maxSize++;
            }
        }
        return maxSize;
    }
}