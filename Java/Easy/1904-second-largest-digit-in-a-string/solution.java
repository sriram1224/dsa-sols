class Solution {
    public int secondHighest(String s) {
      
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int e = Character.getNumericValue(ch);
                if(e>first){
                    second = first;
                    first = e;
                }
                else if(e>second && e != first) second = e;
            }
        
        }


        


        return (second==Integer.MIN_VALUE ? -1 : second);
    }
}