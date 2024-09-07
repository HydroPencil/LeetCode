class CountIntegersWithEvenDigitSum {
    public int countEven(int num) {
        int cnt = 0;

        for(int i=2; i<=num; i++){
            if(flag(i)) cnt++;
        }

        return cnt;
    }

    boolean flag(int n){
        if(n < 10){
            if(n % 2 == 0) return true;

            return false;
        }

        int sum = 0;

        while(n > 0){
            sum += n%10;
            n /= 10;
        }

        return sum%2 == 0;
    }
}