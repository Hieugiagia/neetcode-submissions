class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i = 0; i < s.length() - 1; i++){
            int res1 = s.charAt(i);
            int res2 = s.charAt(i + 1);
            sum += Math.abs(res1 - res2);
        }
        return sum;
    }
}