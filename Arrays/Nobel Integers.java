import java.util.*;

public class Main {
    
    
    public static int Noble(ArrayList<Integer> A){
        Collections.sort(A);
        int n = A.size();
        // if last element = 0 then return 1;
        if(A.get(n-1)==0){ return 1; }
        // rest loop to check if the next no. of elements = current element 
        for(int i=0; i<n-1; i++){
            if(A.get(i)==A.get(i+1)){ continue; }  // if duplicates are there then the last element of that duplicates will be considered
            if(A.get(i)==n-i-1){ return 1; }
        }
        // coming to non 0 end => return -1
        return -1;
    }
    
    
    // main
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(4);
        A.add(3);
        A.add(2);
        A.add(3);
        A.add(-5);
        A.add(4);
        System.out.println(Noble(A));
    }
}

/**

sorted A : [-5, 1, 2, 3, 3, 4, 4]   // in both the 3 the last one will b considered i.e, in index 4 and for both 4 last one will be considered
-1

[-5, 1, 2, 3, 3]    
1                    // coz of 2

**/
