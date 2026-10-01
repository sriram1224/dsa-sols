class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = s.length-1;
        int j = g.length-1;
       while(i>=0 && j>=0){
            if(s[i] >= g[j]) {
                i--;
                j--;
                count++;
            }
            else{
                j--;
            }
        }
        return count;
    }
}