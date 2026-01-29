class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid]> target){
                high = mid-1;
            }else{
                low = mid + 1;
                ans = low;
            }
        }
        return low;
    }
}
