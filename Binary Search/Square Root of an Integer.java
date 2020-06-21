public class Solution {
    
    private int solve(long A, long l, long r){
        if(r-l==1) return (int)l;
        long mid = (l+r)/2;
        if(mid*mid==A) return (int) mid;
        if(mid*mid<A) return solve(A, mid, r);
        return solve(A, l, mid);
    }
    
    public int sqrt(int A) {
        if(A==0 || A==1)
            return A;
        long X = (long)A;
        return solve(X,1,X);
    }
}
