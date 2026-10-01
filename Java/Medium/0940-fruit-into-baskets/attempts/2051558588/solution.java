class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
int max = 0; 
int left = 0;
HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);

            while(map.size()>2 && left< n){
                int leftfruit = fruits[left];
                map.put(leftfruit,map.get(leftfruit)-1);


                if(map.get(fruits[left])==0) map.remove(leftfruit);
                left++;
            }

            if(map.size()<=2) max = Math.max(max,i-left+1);
               
        }
        return max;
    }
}