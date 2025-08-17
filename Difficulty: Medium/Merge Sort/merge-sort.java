class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r){
            return;
        }
        int mid = l + (r-l)/2; //find mid 
        mergeSort(arr,l,mid); // left 
        mergeSort(arr,mid+1,r);//right
        merge(arr,l , mid, r); //merge
      
    }
    void merge(int arr[],int l,int mid,int r){
        int leftSize = mid-l +1;
        int rightSize = r-mid;
        int left[] = new int[leftSize];
        int right[] = new int[rightSize];
        // copy laft rnd raight arr
        for(int i = 0;i<leftSize;i++){
            left[i] = arr[l+i];
        }
        for(int i= 0;i<rightSize;i++){
            right[i] = arr[mid+1+i];
        }
        int i = 0, j = 0, k = l;
        while(i<leftSize && j <rightSize){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<rightSize){
            arr[k] = right[j];
            j++;
            k++;
        }
        
        
    }
}