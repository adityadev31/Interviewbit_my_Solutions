public class Solution {
    public int isPower(int A) {
        if(A==1){ return 1; }
        for(int base=1; base<A; base++){
            int x = (int)(Math.log(A)/Math.log(base));
            if(Math.pow(base, x)==A){ return 1; }
        }
        return 0;
    }
}
