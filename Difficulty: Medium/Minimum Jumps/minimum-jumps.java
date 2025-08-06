class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0;  // Already at the end
        if (arr[0] == 0) return -1;  // Can't move anywhere

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= n - 1) break;

                if (currentEnd == i) return -1; // stuck
            }
        }

        return currentEnd >= n - 1 ? jumps : -1;
    }
}
