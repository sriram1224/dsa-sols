import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0; 
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                max = Math.max(max, i - j + 1);       } else {
                while (set.contains(s.charAt(i))) {
                    set.remove(s.charAt(j));              j++;
                }
                set.add(s.charAt(i));         }
        }
        return max;
    }
}
