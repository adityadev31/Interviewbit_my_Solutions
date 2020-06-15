import java.util.*;

public class Main {
    public static int maxSpecialProduct(ArrayList<Integer> A){
        if(A.size()<3){return 0;}
        long max = Long.MIN_VALUE;
        for(int i=1; i<A.size()-1; i++){
            // left special
            int left = -1;
            int j=i-1;
            while(left==-1 && j>=0){
                if(A.get(j)>A.get(i)){ left=j; }
                j--;
            }
            // ight special
            int right = -1;
            j=i+1;
            while(right==-1 && j<A.size() && left!=-1){
                if(A.get(j)>A.get(i)){ right=j; }
                j++;
            }
            if(left!=-1 && right!=-1){
                long ans = left*right;
                if(ans>max){ max=ans; }
            }
            else{
                long ans = 0;
                if(ans>max){ max=ans; }
            }
        }
        return (int)max%1000000007;
    }
    
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(5);
        A.add(9);
        A.add(3);
        A.add(6);
        A.add(2);
        A.add(8);
        System.out.println("ans = " + maxSpecialProduct(A));
    }
}

// ans = 15
