import java.util.*;
import java.lang.Math;

class Solution{
    
    ArrayList<Integer> getSum(ArrayList<Integer> A){
        // find sum
        int n = A.size();
        int i = n-1;
        int carry = 1;
        int temp;  // for current A.get()
        while(carry != 0 && i>=0){
            temp = A.get(i);
            temp = temp + carry;   // sum of carry and ith index value
            carry = temp/10;       // new carry 
            temp = temp%10;        // new temp;
            A.set(i, temp);        // inserting new temp at i
            i--;
        }
        if(carry!=0){
            A.add(0);                   // adding 1 index at last index
            i=n;
            while(i!=0){                // shift
                A.set(i, A.get(i-1));
                i--;
            }
            A.set(i, carry);            // add carry to index 0
        }
        if(A.get(0)==0){                // if 0 at starting
            i=0;
            while(A.get(i)==0){
                i++;
            }
            ArrayList<Integer> x = new ArrayList<>();
            while(i<A.size()){
                x.add(A.get(i));
                i++;
            }
            return x;
        }
        return A;
    }
}

public class Main{
    
    public static void print(ArrayList<Integer> ans){
        for(int i=0; i<ans.size(); i++){ System.out.print(ans.get(i) + " "); }
    }
    
    public static void main(String args[]){
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(0);
        x.add(0);
        x.add(9);
        x.add(9);
        Solution ob = new Solution();
        ArrayList<Integer> ans = ob.getSum(x);
        print(ans);
    }
}

// ans = 100
