class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0; 
       
        for(int i =0; i<s.length(); i++){
            for(int j =i+1; j<=s.length();j++){
                String sub = s.substring(i,j);
                if(isUnique(sub)) maxLength = Math.max(maxLength,sub.length());

            }
        }
        return maxLength;
    }

    public boolean isUnique(String s){
        boolean[] seen = new boolean[128];
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(seen[c]) return false;
            
            seen[c] = true;
        }
        return true;
    }
}