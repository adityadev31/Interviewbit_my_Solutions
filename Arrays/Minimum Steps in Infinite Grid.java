import java.util.*;
import java.lang.Math;

class Solution {
    
    int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int currX = X.get(0);
        int currY = Y.get(0);
        int c = 0;
        
        for (int i=1;i<X.size();i++) {
            int x = X.get(i);
            int y = Y.get(i);
            
            c += Math.max(Math.abs(y-currY), Math.abs(x-currX));
            currY = y;
            currX = x;
        }
        return c;
    }
}

public class Main{
  public static void main(String args[]){
    ArrayList<Integer> X = new ArrayList<Integer>();
    ArrayList<Integer> Y = new ArrayList<Integer>();
    X.add(0);
    X.add(1);
    X.add(1);
    Y.add(0);
    Y.add(1);
    Y.add(2);
    Solution ob = new Solution();
    System.out.println(ob.coverPoints(X, Y));
  }
}
