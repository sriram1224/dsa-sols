class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
       int right  = n-1;
       int left = 0;

       for(int i =1; i<=n/2; i++){
        arr[right] = i;
        arr[left] = -i;

        right--;
        left++;
       }
       
       return arr;
    }
}