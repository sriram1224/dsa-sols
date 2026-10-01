class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
     
        HashMap<Integer,Character> reverse = new HashMap<>();
        
        for(int i = 0; i<26; i++){
           reverse.put(i,(char)('z'-i));
        }
        String ans = "";

        for(String st :words){
            int sum = 0;
            
        for(char ch : st.toCharArray()){
                sum+= weights[ch-'a'];
        }
        
        ans += ((char) ('z' -(sum%26)));

        }

        return ans;
    }
    
}