class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int first = 0;
        int sum =0;
        List<Integer> list = new ArrayList<>();
        for(int i :num){
            first = (first*10)+i;
        }
        sum= k+ first;
        while(sum>0){
            list.add(sum%10);
           sum /= 10;
        }


        Collections.reverse(list);
return list;
    }
}