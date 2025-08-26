// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
         HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  // prefix sum 0 at index -1
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // store only first occurrence of sum
            map.putIfAbsent(sum, i);
        }

        return maxLen;
    }
}
