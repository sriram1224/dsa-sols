class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length-1;
       int left = 0;
       int max = 0;
       int right = 0;
    for(int i =0; i<k; i++) left += cardPoints[i];

        max = left;
        
        for(int i = k-1; i>=0; i--){
            left -= cardPoints[i];
            right += cardPoints[n];
            n--;
            max = Math.max(left+right,max);

        }
        return max;
        
    }
}