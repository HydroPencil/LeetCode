class PassThePillow {
    public int passThePillow(int n, int time) {
        int cycle = time / (n-1);
        int remain = time % (n-1);

        if(cycle % 2 == 0){
            return remain+1;
        }else{
            return n - remain;
        }
    }
}