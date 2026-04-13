class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        int n = q.size();
        // code here
         if(k <= 0 || k > n) return q;
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<k;i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i =0; i<n-k;i++){
            q.add(q.remove());
        }
        return q;
    }
}