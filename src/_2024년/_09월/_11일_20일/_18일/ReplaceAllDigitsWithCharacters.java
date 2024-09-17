class ReplaceAllDigitsWithCharacters {
    public String replaceDigits(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i > 0 && Character.isDigit(ch)) {
                char c = s.charAt(i - 1);
                char chamar = (char)(c + (ch - '0'));
                result.append(chamar);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}