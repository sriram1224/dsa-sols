class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
     
       StringBuilder ans = new StringBuilder();
        for(String st :words){
            int sum = 0;
            
        for(char ch : st.toCharArray()){
                sum+= weights[ch-'a'];
        }
        
        ans.append((char) ('z' -(sum%26)));

        }

        return ans.toString();
    }
    
}