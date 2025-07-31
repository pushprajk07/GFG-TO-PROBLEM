class Solution {
    public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue <Integer> q2 = new LinkedList<>();
        int n =q.size();
        for(int i = n/2;i<n;i++){
            q2.add(q.remove());
        }
        while(!q2.isEmpty()){
            q.add(q2.remove());
            q.add(q.remove());
            
            
        }
        return q;
    }
}
