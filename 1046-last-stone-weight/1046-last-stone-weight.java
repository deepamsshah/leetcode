class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        System.out.println(pq);
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            if(x!=y){
                x=x-y;
                pq.add(x);
            }
        }
        return pq.isEmpty() ? 0 : pq.remove();
    }
}