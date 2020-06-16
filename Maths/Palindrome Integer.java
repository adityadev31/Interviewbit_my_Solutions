public class Solution {
    public int isPalindrome(int A) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        s1.append(A);
        s2.append(A);
        s2.reverse();
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i))
                return 0;
        }
        return 1;
    }
}
