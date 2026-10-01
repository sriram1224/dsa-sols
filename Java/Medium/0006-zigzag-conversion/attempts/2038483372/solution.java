class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        List<StringBuilder> ls = new ArrayList<>();
        for(int i = 0; i<numRows;i++)   ls.add(new StringBuilder());
        int currentRow = 0;
        boolean downdirection = false;
        for(char ch: s.toCharArray()){
            ls.get(currentRow).append(ch);
            if(currentRow == 0 ||currentRow == numRows-1  ) downdirection = !downdirection;
            
            currentRow += downdirection?1:-1;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder sb : ls){
            result.append(sb);
        }
        return result.toString();
    }
}