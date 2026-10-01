class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length;
        int max = 0; 
        int j =0;
        HashSet<Character> set = new HashSet<>();
        for(int i =0; i<n; i++){
            if(!set.contains(set.charAt(i))){
                set.add(s.charAt(i));
                max = Math.max(max, i-j);
            }
            else{
                set.remove(s.charAt(i));
                j++;
            }
        }
        return max;
    }
}