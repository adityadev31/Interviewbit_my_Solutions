
class StrComp implements Comparator<String>{
    public int compare(String x, String y){
        String A = new String(x+y);
        String B = new String(y+x);
        return B.compareTo(A);      // returns 1 if(B>A) --> swapping is needed
    }
}

public class Solution {
    public String largestNumber(final List<Integer> A) {
    
        // converting into string
        String arr[] = new String[A.size()];
        for(int i=0; i<A.size(); i++) arr[i] = Integer.toString(A.get(i));
        
        // sorting array
        Arrays.sort(arr, new StrComp());
        if(Integer.parseInt(arr[0])==0) return "0";
        StringBuilder sb = new StringBuilder();
        for(String x: arr) sb.append(x);
        return sb.toString();
    }
}
