import java.util.*;

public class Main {
    
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> A, ArrayList<Integer> D){
        int n = A.size();
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(A.get(j)>A.get(j+1)){
                    int temp = A.get(j);   // soting A
                    A.set(j, A.get(j+1));
                    A.set(j+1, temp);
                    
                    temp = D.get(j);       // arranging D according to A
                    D.set(j, D.get(j+1));
                    D.set(j+1, temp);
                }
            }
        }return D;
    }
    
    public static boolean booking(ArrayList<Integer> A, ArrayList<Integer> D, int rooms){
        bubbleSort(A, D);
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        int n = Collections.max(D);         // max time (last customer exit time)
        int custno = 0;
        int index = 0;
        for(int time=0; time<=n; time++){
            // arival
            while(index<D.size()){              // accept all arrivals at current time
                if(A.get(index)==time){         // arrival time & current time matched -> customer++
                    q.add(D.get(index));        // add that customer's dept time in queue
                    custno+=1;
                    index++;
                }else{ break; }
            }
            // departure
            while(q.size()>0){       // if current time is departure time then remove customers for that time
                if(q.peek()==time){
                    q.poll();
                    custno-=1;
                }
                else{ break; }
            }
            if(custno>rooms){ return false; }
        }
        return true;
    }
    
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> D = new ArrayList<Integer>();
        A.add(47);
        A.add(4);
        A.add(0);
        A.add(12);
        A.add(47);
        A.add(31);
        A.add(15);
        A.add(49);
        A.add(29);
        A.add(33);
        A.add(7);
        A.add(22);
        A.add(26);
        A.add(24);
        A.add(16);
        D.add(95);
        D.add(4);
        D.add(26);
        D.add(16);
        D.add(51);
        D.add(79);
        D.add(43);
        D.add(58);
        D.add(32);
        D.add(80);
        D.add(30);
        D.add(27);
        D.add(29);
        D.add(54);
        D.add(16);
        int rooms = 10;
        System.out.println("ans = "+ booking(A, D, rooms));
    }
}
// ans = true
