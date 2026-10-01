class Solution {
    public int majorityElement(int[] arr) {
        int candidate = 0;
        int count = 0;

        // First pass: Find a potential candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        // Second pass: Verify if the candidate is the majority element
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        // Check if the candidate is the majority element
        return (count > arr.length / 2) ? candidate : -1; // Return -1 if there is no majority element
    }
}
