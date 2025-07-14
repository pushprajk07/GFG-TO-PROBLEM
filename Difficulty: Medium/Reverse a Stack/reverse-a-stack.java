// User function Template for Java

class Solution {
    static void reverse(Stack<Integer> s) {
        // add your code here
        if(s.size()==1){
            return ;
        }
        int top = s.pop();
        reverse(s);
        pushAtButtom(s,top);
        
        return;
        
    }
    static Stack<Integer> pushAtButtom(Stack<Integer> s,int x){
        if(s.isEmpty()){
            s.push(x);
            return s;
        }else{
        int rop  = s.pop();
        pushAtButtom(s,x);
        s.push(rop);
        }
        return s;
    }
}