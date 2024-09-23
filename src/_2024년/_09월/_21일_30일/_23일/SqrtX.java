class SqrtX {
    public int mySqrt(int x) {
        int temp=0;
        if(x<1) return 0;
        if(x==1) return 1;
        temp=(int)Math.sqrt(x);

        return temp;
    }
}