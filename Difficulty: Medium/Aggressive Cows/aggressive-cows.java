import java.util.*;

class Solution {
    public int aggressiveCows(int[] stalls, int k) {

        Arrays.sort(stalls);   // 1️⃣ Sort first
        
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(pokk(stalls, mid, k)){
                ans = mid;          // store possible answer
                low = mid + 1;      // try bigger distance
            } else {
                high = mid - 1;     // reduce distance
            }
        }

        return ans;
    }

    boolean pokk(int arr[], int d, int c){
        int count = 1;
        int lastplace = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] - lastplace >= d){
                count++;
                lastplace = arr[i];

                if(count == c) return true;  // small optimization
            }
        }

        return false;
    }
}
