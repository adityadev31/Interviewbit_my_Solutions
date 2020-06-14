/**

question - make wave like structure ex - 2 1 4 3 5  -->  up down up down up
hint -  swap with increment of 2 

**/ 


import java.util.*;

public class Main {
    
    // printer
    public static void print(ArrayList<Integer> ans){
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
    
    // wave maker
    public static ArrayList<Integer> getWave(ArrayList<Integer> A){
        Collections.sort(A);
        for(int i=0; i<A.size()-1; i+=2){
            // swap with increment of 2
            int temp = A.get(i);
            A.set(i, A.get(i+1));
            A.set(i+1, temp);
        }
        return A;
    }
    
    // main
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(5);
        A.add(4);
        A.add(1);
        A.add(3);
        A.add(2);
        ArrayList<Integer> ans = getWave(A);
        print(ans);
    }
}


// ans = 2 1 4 3 5
