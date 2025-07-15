
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack <Integer> st = new Stack<>();
        list.add(1);
        st.push(0);
        for(int i =1;i<arr.length;i++){
            int currentPrice = arr[i];
            while(!st.isEmpty() && currentPrice >= arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                list.add(i+1);
            }else{
                int prevHigh = st.peek();
                list.add(i-prevHigh);
            }
            st.push(i);
        }
        return list;
    }
}