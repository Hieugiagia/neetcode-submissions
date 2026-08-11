class Solution {
    public int maxScore(String s) {
        int sumOne = 0;
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == '1'){
                sumOne++;
            }
        }
        int leftZero = 0;
        int rightOne = sumOne;
        int maxScore = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == '0'){
                leftZero++;
            }if(s.charAt(i) == '1'){
                rightOne--;
            }
            int score = leftZero + rightOne;
            maxScore = Math.max(maxScore,score);
        }
        return maxScore;
    }
}