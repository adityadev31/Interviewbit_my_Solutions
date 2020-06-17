public class Solution {
    
    public int GCD(int A, int B) {
        // make A smaller (considering B always > A)
        if(A>B){
            int x = A;
            A = B;
            B = x;
        }
        while(A!=0){
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
    
    public int cpFact(int A, int B) {
        while(GCD(A, B)!=1){
            A = A/GCD(A, B);
        }
        return A;
    }
}
