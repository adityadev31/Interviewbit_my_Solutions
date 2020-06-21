public class Solution {
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        int[] a = new int[A.size()*A.get(0).size()];
        int count = 0;
        for(int i=0; i<A.size(); i++){
            for(int j=0; j<A.get(0).size(); j++){
                a[count++] = A.get(i).get(j);
            }
        }
        Arrays.sort(a);
        int r = a.length-1;
        if(r%2!=0) return a[(r/2)+1];
        return a[r/2];
    }
}
