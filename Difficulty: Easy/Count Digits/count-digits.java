// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count = 0;
        int p = n;
        while(p != 0){
            int remander = p%10;
            if(remander == 0){
                p = p/10;
                continue;
            }
           
             if (n % remander == 0 ){
                 count++;
             }
             p = p/10;
        }
        return count;
       
        
    }
}