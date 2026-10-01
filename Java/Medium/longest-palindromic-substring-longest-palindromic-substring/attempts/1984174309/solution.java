class Solution {
    public String longestPalindrome(String s) {
        String str="";
        String maxSub = "";
       for(int i = 0; i<s.length(); i++){
        for(int j =i+1; j<s.length(); j++){
              str = s.substring(i,j);
             if(isPalindrome(str)){
                if(maxSub.length() < str.length())maxSub = str ;

                
             }
        }
       }
       return maxSub;    
    }
    public boolean isPalindrome(String str){
            int l = 0; 
            int r = str.length()-1;

            while(l<r){
                if(str.charAt(l)!=str.charAt(r)) return false;

                l++; 
                r--;
            }
            return true;
        }
}