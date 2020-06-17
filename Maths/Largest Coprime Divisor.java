public class Solution {
    
    public int GCD(int A, int B){
        while(A!=0 && B!=0){
            if(A==B){ return B; }
            if(A>B){       // A == smaller always
                int x = A;
                A = B;
                B = x;
            }
            int diff = B-A;
            B = diff;
        }
        if(A==0)
            return B;
        return A;
    }
    
    public int cpFact(int A, int B) {
        while(GCD(A, B)!=1){
            A = A/GCD(A, B);
        }
        return A;
    }
}
