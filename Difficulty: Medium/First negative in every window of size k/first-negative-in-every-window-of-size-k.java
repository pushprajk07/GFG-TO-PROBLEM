import java.util.*;

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {

        List<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        int n = arr.length;

        for(int i = 0; i < n; i++){

            // store index of negative numbers
            if(arr[i] < 0){
                dq.addLast(i);
            }

            // remove elements outside window
            if(!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.pollFirst();
            }

            // window size reached
            if(i >= k - 1){
                if(dq.isEmpty()){
                    ans.add(0);
                }else{
                    ans.add(arr[dq.peekFirst()]);
                }
            }
        }

        return ans;
    }
}