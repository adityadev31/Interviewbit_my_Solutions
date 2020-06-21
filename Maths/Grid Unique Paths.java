public class Solution {
    
    public int solve(int A, int B, int i, int j){
        if(A==1 || B==1) return 1;
        if(i==A-1 && j==B-1) return 1;
        if(i>=A || j>=B) return 0;
        int op1 = solve(A, B, i+1, j);
        int op2 = solve(A, B, i, j+1);
        return op1+op2;
    }
    
    public int uniquePaths(int A, int B) {
        return solve(A, B, 0, 0);
    }
}
