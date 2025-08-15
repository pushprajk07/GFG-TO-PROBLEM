class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        for(int i = arr.length -1;i>0;i--){
            int p = i;
            for(int j = 0;j<i;j++){
                if(arr[p]<arr[j]){
                    p = j;
                }
            }
            //swap
            int temp = arr[p];
            arr[p] = arr[i];
            arr[i] = temp;
        }
        return;
        
    }
}