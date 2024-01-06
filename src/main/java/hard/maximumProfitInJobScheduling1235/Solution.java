package hard.maximumProfitInJobScheduling1235;

class Solution {
    static class Job{
        int startTime, endTime, profit;
        public Job(int startTime, int endTime, int profit){
            this.startTime = startTime;
            this.endTime = endTime;
            this.profit = profit;
        }
    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int inputLength = startTime.length;
        Job[] jobs = new Job[inputLength];
        for(int i=0; i<inputLength; i++){
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
        Arrays.sort(jobs, Comparator.comparingInt(o -> o.startTime));
        Integer[] dp = new Integer[inputLength];
        return solve(dp, jobs, 0);
    }

    private int solve(Integer[] dp, Job[] jobs, int i){
        if(i >= jobs.length) return 0;
        if(dp[i] != null) return dp[i];

        Job current = jobs[i];
        int next = jobs.length;

        for(int j=i+1; j<jobs.length; j++){
            if(current.endTime <= jobs[j].startTime) {
                next = j;
                break;
            }
        }
        int max = current.profit + solve(dp, jobs, next);
        max = Math.max(max, solve(dp, jobs, i+1));

        return dp[i] = max;
    }
}