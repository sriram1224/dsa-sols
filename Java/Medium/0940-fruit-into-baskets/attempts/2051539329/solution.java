class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
int max = 0; 

        for(int i = 0; i<n; i++){
            Set<Integer> set = new HashSet<>();
            
                for(int j = i; j<n; j++){
                    set.add(fruits[j]);
                if(set.size()<=2){
max = Math.max(j-i+1,max);
                }
                else break;
            }
        }
        return max;
    }
}