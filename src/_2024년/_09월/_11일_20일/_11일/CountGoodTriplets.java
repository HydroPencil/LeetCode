class CountGoodTriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int n = arr.length;
        int[][] diff = new int[n][n];

        for(int i=0; i < n; i++){
            for(int j= i+1; j<n; j++){
                diff[i][j] = Math.abs(arr[i] - arr[j]);
            }
        }

        for (int i = 0; i < n-2; i++) {
            for (int j = i + 1; j < n-1; j++) {
                if(diff[i][j] <= a){
                    for(int k = j+1; k < n; k++){
                        if(diff[j][k] <= b && diff[i][k] <= c){
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}