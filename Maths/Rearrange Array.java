public class Solution {
    public void arrange(ArrayList<Integer> a) {
        int copy[] = new int[a.size()];
        for(int i=0; i<a.size(); i++){ copy[i] = a.get(i); }
        for(int i=0; i<a.size(); i++){
            a.set(i, copy[copy[i]]);
        }
    }
}
