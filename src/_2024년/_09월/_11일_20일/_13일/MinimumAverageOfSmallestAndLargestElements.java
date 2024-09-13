class MinimumAverageOfSmallestAndLargestElements
{
    public double minimumAverage(int[] nums)
    {
        double ans = 0.0;
        for(int j=0;j<nums.length/2;j++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int min_in = 0;
            int max_in = 0;
            for(int i=0;i<nums.length;i++) {
                if(nums[i]==-1) continue;

                if(nums[i]>max)
                {
                    max = nums[i];
                    min_in = i;
                }
                if(nums[i]<min)
                {
                    min = nums[i];
                    max_in = i;
                }

            }
            nums[max_in] = -1;
            nums[min_in] = -1;
            double avg = (min+max)/2.0;

            if(avg<ans || ans==0.0) ans = avg;
        }

        return ans;
    }
}