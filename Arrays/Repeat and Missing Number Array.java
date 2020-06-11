import java.util.*;

public class Main {
    
    public static ArrayList<Integer> repeatedNumber(ArrayList<Integer> x) {
        boolean a[] = new boolean[x.size()+1];
        int A = Integer.MIN_VALUE;
        int B = Integer.MIN_VALUE;
        Arrays.fill(a, false);
        // read and write
        for(int i=0; i<x.size(); i++){
            if(a[x.get(i)]==false){ a[x.get(i)] = true; }
            else{ A = x.get(i); }   // if already true visited then its A
        }
        // only missing value i.e, B = false
        for(int i=1; i<a.length; i++){
            if(a[i]==false){
                B = i;
                break;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(A);
        ans.add(B);
        return ans;
    }
    
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(1);
        a.add(2);
        a.add(5);
        a.add(3);
        ArrayList<Integer> ans = repeatedNumber(a);
        System.out.println("A = " + ans.get(0) + "   B = " + ans.get(1));
    }
}

// ans = A=3 B=4
