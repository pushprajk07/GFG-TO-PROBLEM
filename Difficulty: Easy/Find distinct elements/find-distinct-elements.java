// User function Template for Java
class Solution {
    static int distinct(int arr[]) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        for(int nums:arr){
            hs.add(nums);
        }
        return hs.size();
    }
}