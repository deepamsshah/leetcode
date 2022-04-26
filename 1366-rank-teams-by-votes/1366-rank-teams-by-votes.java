class Solution {
public String rankTeams(String[] votes) {
        Map<Character, int[]> map = new HashMap<>();
        Arrays.stream(votes).forEach(vote ->{
            char[] voteArr = vote.toCharArray();
            for(int i=0; i<vote.length(); i++){
                int[] rank = map.getOrDefault(voteArr[i], new int[vote.length()]);
                rank[i]++;
                map.putIfAbsent(voteArr[i], rank);
            }
        });
       // printMap(map);
        
        return map.keySet().stream().sorted((a,b) -> {
            int[] arr1 = map.get(a);
            int[] arr2 = map.get(b);
            for(int i=0; i<arr1.length; i++){
                if(arr1[i] != arr2[i])
                    return arr2[i]-arr1[i];
            }
            return a-b;
            
        }).map(String::valueOf).collect(Collectors.joining());
    }
}