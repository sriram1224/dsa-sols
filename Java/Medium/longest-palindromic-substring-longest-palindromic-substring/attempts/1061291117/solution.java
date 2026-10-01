class Solution {
    public String longestPalindrome(String s) {
          String ans = "";
        String maxSubString = "";
        
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                ans = s.substring(i, j+1);
                if(isPalindrome(ans)){
                   if (maxSubString.length() < ans.length()){
                       maxSubString = ans;
                   }
                }
                else{
                    continue;
                }
            }
        }
        
        return maxSubString;
    }
    
    public static boolean isPalindrome(String ans){
        int l = 0, r = ans.length()-1;
        int count = 0, max = -1;
        while(l < r){
            if(ans.charAt(l) != ans.charAt(r)){
                return false;
            }
            l++;   r--;
        }
        return true;
    }
}