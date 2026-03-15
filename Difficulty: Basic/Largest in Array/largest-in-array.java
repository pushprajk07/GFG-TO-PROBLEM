class Solution {
    public static int largest(int[] arr) {
        // code here
        int maxx = 0;
        for(int i = 0; i < arr.length; i++){
            maxx = Math.max(maxx,arr[i]);
        }
        return maxx;
    }
}
