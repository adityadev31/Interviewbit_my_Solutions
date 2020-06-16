public class Solution {
    public int gcd(int A, int B) {
        // make A smaller (considering B always > A)
        if(A>B){
            int x = A;
            A = B;
            B = x;
        }
        while(A!=0){
            // diff
            int diff = B-A;
            if(diff>A){
                B = diff;
            }else{
                B = A;
                A = diff;
            }
        }
        return B;
    }
}
