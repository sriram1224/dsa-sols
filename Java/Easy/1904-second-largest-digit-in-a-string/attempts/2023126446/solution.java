class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                list.add(Character.getNumericValue(ch));
            }
        Collections.sort(list);
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i : list){
            if(i>first){
            second = first;
            first = i;

            }
            else if(i>second && i != first) second = i;
        }


        return (second==Integer.MIN_VALUE ? -1 : second);
    }
}