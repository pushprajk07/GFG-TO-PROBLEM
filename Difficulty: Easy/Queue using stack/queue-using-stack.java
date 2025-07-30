class Queue {
    Stack<Integer> input = new Stack<Integer>();
    Stack<Integer> output = new Stack<Integer>();

    int dequeue() {
        // code here
        return input.pop();
        
    }

    void enqueue(int x) {

        
        // code here
      
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        input.push(x);
        while(!output.isEmpty()){
            input.push(output.pop());
        }
    }
}
