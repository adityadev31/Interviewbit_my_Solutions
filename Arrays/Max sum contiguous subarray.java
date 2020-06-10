import java.util.*;
import java.lang.Math;

class Solution{
    int findMax(ArrayList<Integer> x){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<x.size(); i++){
            sum = sum + x.get(i);
            if(sum<0){ sum = 0; }
            if(max<sum){ max = sum; }
        }
        return max;
    }
}

public class Main{
    
    public static void main(String args[]){
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(-2);
        x.add(1);
        x.add(-16);
        x.add(-16);
        x.add(5);
        x.add(-1);
        x.add(4);
        Solution ob = new Solution();
        int ans = ob.findMax(x);
        System.out.println(ans);
    }
}

// ans = 5, -1, 4 = 8
