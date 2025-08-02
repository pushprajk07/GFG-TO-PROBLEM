class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
         double ratio[][] = new double[values.length][2];
         int n = values.length;
        for(int i =0; i<n;i++){
            ratio[i][0] = i;
            ratio[i][1] = (double)values[i]/weights[i]; 
        }
        //sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
       

    
        double val = 0;
       
        for(int i = n-1; i>=0;i--){
            if(weights[(int)ratio[i][0]] <=W){
                val += values[(int)ratio[i][0]]; 
                W -= weights[(int)ratio[i][0]];
            }
            else{
                val += ratio[i][1]*(double)W;
                break;
            
            }
        }
        return  val;
        
    }
}