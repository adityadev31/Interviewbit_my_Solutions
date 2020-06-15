import java.util.*;

public class Main{
    
    public static ArrayList<Integer> subUnsort(ArrayList<Integer> A){
        // copy contains original A
        ArrayList<Integer> copy = new ArrayList<>();
        for(int i=0; i<A.size(); i++){ copy.add(A.get(i)); }
        Collections.sort(A);
        // checking and matching
        int i=-1;
        int j=-1;
        // from front
        int index=0;
        while(index<A.size() && i==-1){    // moment we get i the loop will stop
            if(copy.get(index)!=A.get(index)){ i=index; }
            index++;
        }
        // from back
        index=A.size()-1;
        while(index>0 && j==-1){         // th moment we get j the loop will stop
            if(copy.get(index)!=A.get(index) && i!=-1){ j=index; } // i must be initialized before we get j
            index--;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(i==-1){ ans.add(-1); }
        else{ ans.add(i); ans.add(j); }
        return ans;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(3);
        A.add(4);
        A.add(2);
        A.add(5);
        ArrayList<Integer> ans = subUnsort(A);
        System.out.println(ans);
    }
}
// ans = [1, 3]
