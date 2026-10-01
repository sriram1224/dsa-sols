class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;

        int[] arr = new int[n+1];

        arr[0] = 0;
        int max = Integer.MIN_VALUE;
        int currentHeight = 0;
        for(int i =0; i<n; i++){
            currentHeight += gain[i];
            arr[i+1]  = currentHeight;
            max = Math.max(currentHeight,max);
        }
        return max<0? 0:max;
    }
}