class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l =0, r = 0, length= 0;
        char ch;
        while(r<s.length()){
            ch = s.charAt(r);
            if(map.containsKey(ch)&& map.get(ch)>=l){
                l = Math.max(l,map.get(ch)+1);
            }
                map.put(ch,r);
                length = Math.max(length,r-l+1);
                r++;
        }
        return length;
    }
}