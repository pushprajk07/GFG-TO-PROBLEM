class Queues {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    void push(int a) {
        // code here
        if(!q1.isEmpty()){
            q1.add(a);
        }else{
            q2.add(a);
        }
        
    }

    int pop() {
        int top = -1;
        if(q1.isEmpty()&&q2.isEmpty()){
           return top;
        }

        else if(!q1.isEmpty()){
            while(!q1.isEmpty()){
            top = q1.remove();
            if(q1.isEmpty()){
                break;
            }
            q2.add(top);
            }
        }else{
            while(!q2.isEmpty()){
                top = q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }
        return top;
        
        // code here
    }
}