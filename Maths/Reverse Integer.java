public class Solution {
    public int reverse(int A) {
        StringBuilder s1 = new StringBuilder();
        boolean flag = false;
        if(A<0){          // making +ve
            A = A*(-1); 
            flag = true;
        }  
        s1.append(A);
        s1.reverse();
        if(flag==true)  // if -ve insert '-' at start
            s1.insert(0, '-');
        String strAns = s1.toString();
        long ans =  Long.valueOf(strAns);
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE)
            return 0;
        return (int)ans;
    }
}
