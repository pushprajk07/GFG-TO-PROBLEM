class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = -1;
        int secondLargest = -1;
        for(int num:arr){
            if(num>largest){
                secondLargest = largest;
                largest = num;
            }if(num>secondLargest && num<largest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}