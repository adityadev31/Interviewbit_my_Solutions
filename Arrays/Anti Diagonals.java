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
    
    
    // diagonals
    public static ArrayList<ArrayList<Integer>> diagonals(ArrayList<ArrayList<Integer>> A){
        int sum = 0;                  // counting of diagonal
        int dia = (A.size()*2)-1;     // no. of diagonals
        ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
        while(sum<dia){
            x.add(new ArrayList<Integer>());
            for(int i=0; i<A.size(); i++){
                for(int j=0; j<A.size(); j++){
                    if(i+j==sum){                          // sum=i+j then add(arr[i][j])
                        x.get(sum).add(A.get(i).get(j));
                    }
                }
            }
            sum++;
        }
        return x;
    }
    
    
    // main
    public static void main(String[] args) throws Exception {
        int sides = 3;
        int count = 1;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<sides; i++){
            arr.add(new ArrayList<Integer>());
            for(int j=0; j<sides; j++){
                arr.get(i).add(count++);
            }
        }
        ArrayList<ArrayList<Integer>> A = diagonals(arr);
        print(arr);
        System.out.println();
        print(A);
    }
}


/**

1 2 3 
4 5 6 
7 8 9 

1 
2 4 
3 5 7 
6 8 
9 

**/
