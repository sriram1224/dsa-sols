class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int Index = 0;
        int count = 0;

        if(ruleKey.equals("type")) Index =0;  
        else if(ruleKey.equals("color")) Index = 1;
        else Index = 2;
       for(List<String> i:items ){
            if(i.get(Index).equals(ruleValue)) count++;
       }


       return count;
    }
}