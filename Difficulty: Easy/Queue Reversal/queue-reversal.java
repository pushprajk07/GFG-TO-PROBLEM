class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> st = new Stack<Integer>();
        int n = q.size();
        for(int i = 0;i<n;i++){
            
            
            st.push(q.remove());
        }
                for(int i = 0;i<n;i++){
            // stake st = new stack<Integer>();
            
            q.add(st.pop());
        }
        
    }
}