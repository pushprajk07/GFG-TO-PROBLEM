//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printGfg(n);
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {
    void printGfg(int N) {
        // Base case
        if (N == 1) {
            System.out.print("GFG ");
            return; // Ensure the function stops at the base case
        }
        // Recursive call
        printGfg(N - 1);
        // Print after the recursive call
        System.out.print("GFG ");
    }
}
