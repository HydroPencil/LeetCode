class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x<0) return false;

        long c = x;
        long reverse = 0;

        while(c != 0) {
            int digit = (int) c % 10;
            reverse = reverse * 10 + digit;
            c /= 10;
        }

        return reverse == x;
    }
}