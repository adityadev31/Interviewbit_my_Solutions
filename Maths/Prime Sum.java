public class Solution {
    
    public boolean isPrime(int x){
        for(int i=2; i*i<=x; i++){
            if(x%i==0)
                return false;
        }return true;
    }
    
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=2; i<=A/2; i++){
            if(isPrime(i)){
                int x = A - i;
                if(isPrime(x)){   // if both i && x are prime -> add to ans
                    ans.add(i);
                    ans.add(x);
                    return ans;
                }
            }
        }return ans;
    }
}
