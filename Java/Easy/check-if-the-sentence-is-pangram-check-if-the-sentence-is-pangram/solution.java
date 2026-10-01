class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] check = sentence.toLowerCase().toCharArray();

        for(char ch = 'a' ; ch<='z'; ch++){
            boolean present = false;
            for(char c:check){
                if(ch==c) present = true;
                
            }
        if(present == false) return false;
        }
        return true;
    }
}