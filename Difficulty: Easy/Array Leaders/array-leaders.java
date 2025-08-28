class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList <Integer> list = new ArrayList<>();
        int n = arr.length-1;
        int b = arr[n];
        list.add(b);
        for(int i = n-1;i>=0;i--){
            if(arr[i]>=b){
                b=arr[i];
                list.add(b);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
