class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Character,Integer> map = new HashMap<>();
        int index = 0;
        for(char ch = 'a'; ch<='z'; ch++){
            map.put(ch,weights[index]);
            index++;
        }
        HashMap<Integer,Character> reverse = new HashMap<>();
        
        for(int i = 0; i<26; i++){
           reverse.put(i,(char)('z'-i));
        }
        String ans = "";

        for(String st :words){
            int sum = 0;
            
        for(char ch : st.toCharArray()){
                sum+= map.get(ch);
        }
        
        ans += reverse.get(sum%26);

        }

        return ans;
    }
    
}