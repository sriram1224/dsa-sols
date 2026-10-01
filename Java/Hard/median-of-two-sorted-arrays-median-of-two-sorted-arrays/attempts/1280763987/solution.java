class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double n = 0.0;
        for(int i =0; i<nums1.length; i++){
            
           
                n+= nums1[i];
            
        }
         for(int i =0; i<nums2.length; i++){
           
           
                n+= nums2[i];
            
        }
       int l = nums1.length+nums2.length;
        n = n/l;
        return n;
    }
}