import java.util.*;

public class Main {
    
    // printer
    public static void print(ArrayList<ArrayList<Integer>> A){
        for(int i=0; i<A.size(); i++){
            for(int j=0; j<A.get(i).size(); j++){
                System.out.print(A.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    
    // pascal triangle
    public static ArrayList<ArrayList<Integer>> printPascal(int num){
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i<num; i++){
            A.add(new ArrayList<Integer>());
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){ A.get(i).add(1); }       // 1 at start and last
                else{ A.get(i).add(A.get(i-1).get(j) + A.get(i-1).get(j-1)); }  // A[i][j] = A[i-1][j] + A[i-1][j-1]
            }
        }
        return A;
    }
    
    // main
    public static void main(String[] args) throws Exception {
        int num = 5;
        ArrayList<ArrayList<Integer>> A = printPascal(num);
        print(A);
    }
}

/**

ans = 

1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 

**/
