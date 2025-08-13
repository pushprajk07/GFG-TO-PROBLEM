class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum  = 0;
        int length = 0;
        map.put(sum,-1);
        for(int i =0; i<arr.length;i++){
            sum+= arr[i];
            if (!map.containsKey(sum)){
                map.put(sum,i);
            }else{
                length = Math.max(length,i-map.get(sum));
            }
        }
        return length;
    }
}