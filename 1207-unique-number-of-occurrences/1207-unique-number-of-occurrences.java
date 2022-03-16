class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            hm.putIfAbsent(arr[i],1);
            hm.computeIfPresent(arr[i],(k,v)->v+=1);
        }
        Set<Integer> se = new HashSet<>();
        for(Map.Entry me:hm.entrySet()){
            if(se.contains(me.getValue())){
                return false;
            }else {
                se.add((Integer) me.getValue());
            }
        }
        return true;
    }
}