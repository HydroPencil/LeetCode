class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        long check = x;
        long reversed = 0;

        while(check != 0) {
            int digit = (int ) check % 10;
            reversed = reversed * 10 + digit;
            check /= 10;
        }

        return reversed == x;
    }
}