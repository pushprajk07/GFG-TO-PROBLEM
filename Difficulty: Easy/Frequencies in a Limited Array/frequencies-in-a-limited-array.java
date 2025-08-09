class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        int n = arr.length;
        List <Integer> list = new ArrayList<>();
        int freq [] = new int[n+1];
        for(int num: arr){
            if(num>=1 && num<=n){
                freq[num]++;
            }
        }
        for(int i = 1;i<=n;i++){
            list.add(freq[i]);
        }
        return list;
    }
}
