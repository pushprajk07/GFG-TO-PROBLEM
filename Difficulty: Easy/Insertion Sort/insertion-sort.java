class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j<arr.length;j++){
                if(arr[i]<arr[j]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return;
    }
}