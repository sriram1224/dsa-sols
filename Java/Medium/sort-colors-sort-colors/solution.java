class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        for(int i =0; i<n; i++){
            for(int j=1; j<n-i; j++){
                if(nums[j-1] > nums[j]){
                    swap(nums,j-1,j);
                }
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
}
