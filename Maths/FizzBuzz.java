public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> ans = new ArrayList<String>();
        for(int i=1; i<=A; i++){
            if(i%3==0 || i%5==0){
                if(i%5!=0){ ans.add("Fizz"); }
                if(i%3!=0){ ans.add("Buzz"); }
                if(i%3==0 && i%5==0){ ans.add("FizzBuzz"); }
            }
            else{ ans.add(String.valueOf(i)); }
        }return ans;
    }
}
