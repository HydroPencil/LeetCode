class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        return validPalindromeHelper(s, 0, s.length() - 1, false);
    }

    private boolean validPalindromeHelper(String s, int left, int right, boolean deleted) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (deleted) return false;
                return validPalindromeHelper(s, left + 1, right, true) ||
                        validPalindromeHelper(s, left, right - 1, true);
            }
            left++;
            right--;
        }

        return true;
}