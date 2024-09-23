class ReverseBits {
    public int reverseBits(int n) {
        int re = 0;
        for (int i =0; i<32;i++)
        {
            re = re << 1;
            re = re | (n & 1);
            n = n >> 1;
        }

        return re;
    }
}