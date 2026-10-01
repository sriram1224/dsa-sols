class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
        backtrack(lst,"",0,0,n);
        return lst;
        
    }

    public void backtrack(List<String> list,String currString,int open,int close,int n){

        if(currString.length()== 2*n){
            list.add(currString);
            return;
        }
        if(open<n){
    
            backtrack(list,currString+'(',open+1,close,n);
        }
        if(close<open){
        backtrack(list,currString+')',open,close+1,n);
        }
    }
}