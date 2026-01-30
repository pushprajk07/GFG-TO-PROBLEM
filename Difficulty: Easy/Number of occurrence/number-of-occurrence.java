class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        if(arr.length == 0) return 0;
        int ans = 0;
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] <= target){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        if(arr[ans] != target) return 0;
        int p = 0;
        low = 0;
        high = arr.length-1;
        while(low <= high){
            int mid = low + (high -low)/2;
            if(arr[mid] >= target){
                p = mid;
                high = mid - 1;
                
            }else{
                low = mid + 1;
            }
            
        }
        return ans - p + 1;
    }
}
