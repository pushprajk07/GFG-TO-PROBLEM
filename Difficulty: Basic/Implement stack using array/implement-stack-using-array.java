class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        if (top < arr.length - 1) {
            top++;
            arr[top] = x;
        }
    }

    public int pop() {
        if (top == -1) {
            return -1;
        } else {
            int val = arr[top];
            top--;
            return val;
        }
    }
}
