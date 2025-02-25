class LostStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<stones.length; i++)
        {
            pq.add(stones[i]);
        }

        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();

            if(a-b!=0){
                pq.add(a-b);
            }
        }
        if(pq.isEmpty())
        {
            return 0;
        }

        return pq.poll();
    }
}