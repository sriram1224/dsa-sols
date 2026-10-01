class Solution {
    public int countBinarySubstrings(String s) {
        int idx =0; 
                int ans =0; 
                int n =s.length();
                while(idx<n){
                        int zeros =0;
                        while(idx<n && s.charAt(idx) == '0'){
                                zeros++;
                                idx++;
                        }
                        int ones =0;
                        while(idx<n && s.charAt(idx)=='1'){
                                ones++;
                                idx++;
                        } 
                        ans += Math.min(zeros,ones);
                }
                idx = 0;
                while(idx<n){
                         int ones =0;
                        while(idx<n && s.charAt(idx)=='1'){
                                ones++;
                                idx++;
                        } 
                        int zeros =0;
                        while(idx<n && s.charAt(idx) == '0'){
                                zeros++;
                                idx++;
                        }
                        ans += Math.min(zeros,ones);
                          
                }
                return ans;
    }
}