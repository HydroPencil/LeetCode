package easy.determineIfStringHalvesAreAlike1704;

class Solution {
    public boolean halvesAreAlike(String s) {
        int a = 0;
        int b = 0;
        int half = s.length()/2;

        for(int i=0; i<half; i++){
            if("aeiouAEIOU".indexOf(s.charAt(i)) != -1) a++;
            if("aeiouAEIOU".indexOf(s.charAt(half+i)) != -1) b++;
        }
        return a==b;
    }
}