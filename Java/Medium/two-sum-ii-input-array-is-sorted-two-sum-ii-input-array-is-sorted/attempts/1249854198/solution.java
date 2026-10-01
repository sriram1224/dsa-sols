class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0; 
        int right = numbers.length-1;
	int[] n = new int[2];
        while(left<right){
            int targeted = numbers[left] +numbers[right];
            if(targeted == target){
	     n[0] = left+1;
         n[1] = right+1;
         return n;
            }
            else if(targeted>target){
                right--;
                
            }
            else{
                left++;
            }
           
        }
       
        
         return n;
    }
}