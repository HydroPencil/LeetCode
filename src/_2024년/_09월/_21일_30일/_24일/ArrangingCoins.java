class ArrangingCoins {
    public int arrangeCoins(int n) {
        long left = 1;
        long right = n;
        long result = 1;
        
        while(left <= right){
            long mid = (left + right) / 2;
            long x = (mid * (mid + 1)) / 2;
            if(x > n){
                right = mid -1;
            }else{
                left = mid + 1;
                result = Math.max(mid,result);
            }
        }

        return (int) result;
    }
}