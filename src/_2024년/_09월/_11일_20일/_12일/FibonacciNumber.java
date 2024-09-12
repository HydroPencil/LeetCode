class FibonacciNumber {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);

        for(int i  = 2 ; i <= n ;i++) {
            int ans = arr.get(i-1) + arr.get(i-2);
            arr.add(ans);
        }

        return arr.get(n);
    }
}