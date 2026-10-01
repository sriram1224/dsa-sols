class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int max = 0;
        int max_frequency=0;
        for(int i =0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                max=count;
                max_frequency = arr[i];
            }
        }
        return max_frequency;
    }
}