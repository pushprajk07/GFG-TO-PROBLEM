class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeSet <Integer>hs = new TreeSet<>();
        for(int  i: a){
            hs.add(i);
        }
        for(int j:b){
            hs.add(j);
        }
        ArrayList <Integer> list = new ArrayList<>();
        for(int i : hs){
            list.add(i);
        }
        return list;
     }
}
