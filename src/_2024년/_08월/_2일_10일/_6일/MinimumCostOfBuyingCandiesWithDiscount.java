class MinimumCostOfBuyingcCandiesWithDiscount {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int ans = 0;
        for(int i=cost.length-1, count = 1; i>=0; i--,count++) {
            if(count % 3 == 0) continue;
            ans += cost[i];
        }

        return ans;
    }
}