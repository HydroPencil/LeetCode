package medium.determineIfTwoStringsAreClose1657;

class Solution {
    final static int ALPHABET_LENGTH = 26;
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        int[] count1 = new int[ALPHABET_LENGTH];
        int[] count2 = new int[ALPHABET_LENGTH];

        for(int i=0; i<word1.length(); i++){
            count1[word1.charAt(i)-'a']++;
            count2[word2.charAt(i)-'a']++;
        }

        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        for(int i=0; i<ALPHABET_LENGTH; i++){
            if(count1[i]==0 ^ count2[i]==0) return false;
            if(count1[i]!=0&&count2[i]!=0){
                ls1.add(count1[i]);
                ls2.add(count2[i]);
            }
        }

        Collections.sort(ls1);
        Collections.sort(ls2);

        return Arrays.equals(ls1.toArray(), ls2.toArray());
    }
}