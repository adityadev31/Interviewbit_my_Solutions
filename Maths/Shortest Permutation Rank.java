public class Solution {
    
    public int factorial(int x){
        if(x <= 1)
            return 1;
        return (x*factorial(x-1))%1000003;
    }
    
    public int findRank(String A) {
        ArrayList<Character> S = new ArrayList<>();
        for(int i=0; i<A.length(); i++){ S.add(A.charAt(i)); }
        Collections.sort(S);
        int len = A.length();
        int count = 0;
        int i = 0;
        while(S.size()>=2){
            char current = A.charAt(i);
            int indInSorted = S.indexOf(current);  // indInSorted = no. of lower chars
            count = count + (((factorial(len-1-i)%1000003)*indInSorted)%1000003);
            S.remove(new Character(current));
            i++;
        }
        return (count+1)%1000003;
    }
}
