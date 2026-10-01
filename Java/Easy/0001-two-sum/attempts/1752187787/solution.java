class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num: nums){
            arr.add(num);
           
        }
        // int i = arr[0];
        // int end = arr.size()-1;
        // while(i<end){
        //     if(arr[i]+arr[end] == target){
        //         System.out.println("["+i+","+end+"]");
        //     }
        //     i++;
        //     end--;
        // }


        for(int i =0; i<arr.size();i++){
            for(int j = i+1; j<arr.size();j++){
                if(arr.get(i) +arr.get(j) == target) return new int[]{i,j};
            }
        }
        return new int[]{};

    }
}