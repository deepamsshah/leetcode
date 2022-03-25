class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        int length = candies.length;
        for(int i=0;i<length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        List<Boolean> candyList = new ArrayList<Boolean>(Arrays.asList(new Boolean[length]));
        Collections.fill(candyList, Boolean.FALSE);
        for(int i=0;i<length;i++){
            if(candies[i]+extraCandies>=max){
                candyList.set(i,Boolean.TRUE);
            }
        }
        return candyList;
    }
}