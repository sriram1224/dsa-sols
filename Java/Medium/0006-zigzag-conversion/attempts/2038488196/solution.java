class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder[] ls = new StringBuilder[numRows];
        for(int i = 0; i<numRows;i++)   ls[i] = new StringBuilder();
        int currentRow = 0;
        boolean downdirection = false;
        for(char ch: s.toCharArray()){
            ls[currentRow].append(ch);
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