class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int emptyBottles = numBottles;

        while(emptyBottles >= numExchange) {
            int nextNumBottles = emptyBottles/numExchange;
            ans += nextNumBottles;
            emptyBottles = nextNumBottles + emptyBottles%numExchange;
        }

        return ans;
    }
}