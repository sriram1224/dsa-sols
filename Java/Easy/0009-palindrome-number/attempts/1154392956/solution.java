class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        
        if(str.length()<=1){
            return true;
        }
        
        char last = str.charAt(str.length()-1);
        char first = str.charAt(0);

        if(last==first){
            return isPalindrome(Integer.parseInt(str.substring(1,str.length()-1)));
        }
        return false;
    }
}