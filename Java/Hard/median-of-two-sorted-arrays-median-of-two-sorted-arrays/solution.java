class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newarray = new int[nums1.length + nums2.length];
        for(int i = 0; i<nums1.length; i++){
            newarray[i] = nums1[i];
        }
        for(int i= 0; i<nums2.length; i++){
            newarray[i+nums1.length]  =  nums2[i];
        }
        Arrays.sort(newarray);
        int n = newarray.length;
        
            double result = 0;
            if(n%2!=0){
                return newarray[n/2];
            }
            else{
                return (newarray[(n/2)]+newarray[(n/2)-1])/2.00;
            }
        
       
    }
}