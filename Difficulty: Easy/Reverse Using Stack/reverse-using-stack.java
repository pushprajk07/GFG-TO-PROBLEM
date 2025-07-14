import java.util.Stack;

class Solution {
    public String reverse(String S) {
        Stack<Character> st = new Stack<>();
        
        // Push all characters of the string into the stack
        for (int i = 0; i < S.length(); i++) {
            st.push(S.charAt(i));
        }

        // Pop all characters from the stack and build reversed string
        StringBuilder sbt = new StringBuilder();
        while (!st.isEmpty()) {
            sbt.append(st.pop());
        }

        return sbt.toString();
    }
}
