class CountPrefixesOfAGivenString {
    public int countPrefixes(String[] words, String s) {

        Map<String, Integer> wordMap = new HashMap<>();

        int count = 0;

        for(String currWord : words) {
            if(!wordMap.isEmpty() && wordMap.containsKey(currWord)) {
                wordMap.put(currWord, wordMap.get(currWord) + 1);
                continue;
            }

            wordMap.put(currWord, 1);
        }

        StringBuilder currSubString = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {

            currSubString.append(s.charAt(i));
            String currSubstr = currSubString.toString();

            if(wordMap.containsKey(currSubstr)) {
                int wordCount = wordMap.get(currSubstr);
                if(wordCount > 0) {
                    count += wordCount;
                    wordMap.put(currSubstr, 0);
                }
            }

        }

        return count;
    }
}