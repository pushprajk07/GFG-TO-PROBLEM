class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i = 0;i<arr.length-1;i++){
            int smallest = i;
            for(int j = i+1;j<arr.length;j++){
                
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
                
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            
        }
        return;
    }
}