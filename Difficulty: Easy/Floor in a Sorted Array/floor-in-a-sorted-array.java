class Solution {
    public int findFloor(int[] arr, int x) {
        int s = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (s <= end) {
            int mid = s + (end - s) / 2;

            if (arr[mid] <= x) {
                ans = mid;        // store this candidate
                s = mid + 1;      // search right for better candidate
            } else {
                end = mid - 1;    // search left
            }
        }
        return ans;
    }
}