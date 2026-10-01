import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> charset = new HashSet<>();
        int l =0; 
        int r = 0;
        int n = s.length();
        int maxLength = 0;

        while(r<n){
            if(!charset.contains(s.charAt(r))){
                charset.add(s.charAt(r));
                maxLength = Math.max(maxLength,r-l+1);
                r++;
            }
            else{
                charset.remove(s.charAt(l));
                l++;
            }
        }
        return maxLength;
    }
}