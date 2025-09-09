import java.util.*;

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Count frequency of each element
        for (int i = 0; i < n; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        int repeating = -1, missing = -1;

        for (int i = 1; i <= n; i++) {
            if (!hm.containsKey(i)) {
                missing = i; // number not found
            } else if (hm.get(i) == 2) {
                repeating = i; // number occurs twice
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(repeating);
        ans.add(missing);
        return ans;
    }
}
