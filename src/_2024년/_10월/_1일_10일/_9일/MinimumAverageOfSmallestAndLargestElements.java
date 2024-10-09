class MinimumAverageOfSmallestAndLargestElements {
    public int fillCups(int[] amount) {
        int seconds = 0;
        Arrays.sort(amount);
        int highestNum = amount.length-1;
        int secondHighestNum = amount.length-2;

        while (amount[highestNum]>0 && amount[secondHighestNum]>0){
            amount[highestNum]--;
            amount[secondHighestNum]--;
            seconds++;
            Arrays.sort(amount);
        }

        while (amount[highestNum]>0){
            amount[highestNum]--;
            seconds++;
        }

        return seconds;
    }
}