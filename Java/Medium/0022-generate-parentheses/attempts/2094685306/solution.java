class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(lst,sb,0,0,n);
        return lst;
        
    }

    public void backtrack(List<String> list,StringBuilder sb,int open,int close,int n){

        if(sb.length()== 2*n){
            list.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append('(');
    
            backtrack(list,sb,open+1,close,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
        backtrack(list,sb,open,close+1,n);
        sb.deleteCharAt(sb.length()-1);
        }
    }
}