class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        for(int i:a){
            hs.add(i);
        }
        for(int i : b){
            hs.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:hs){
            list.add(i);
        }
        return list;
    }
}