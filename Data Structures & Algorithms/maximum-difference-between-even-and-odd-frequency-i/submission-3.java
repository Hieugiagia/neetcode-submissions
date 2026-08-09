class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c, 0) + 1);
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for(int fred : map.values()){
            if(fred % 2 == 0){
                minEven = Math.min(minEven, fred);
            }
            if(fred % 2 != 0){
                maxOdd = Math.max(maxOdd, fred);
            }
        }
        return maxOdd - minEven;
    }
}