class NumberComplement {
    public int findComplement(int num) {
        int ans = 0;
        int n = num;
        int power = 1;

        while (n > 0) {
            int last = n%2;

            if(last == 0) {
                ans = ans + power * 1;
            }

            n /= 2;
            power *= 2;
        }

        return ans;
    }
}                                                        |