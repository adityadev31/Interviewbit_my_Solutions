import java.util.*;

public class Main {
    
    public static boolean booking(ArrayList<Integer> A, ArrayList<Integer> D, int K){
        Collections.sort(A);
        Collections.sort(D);
        int i=0, j=0, roomsReq=0;
        while(i<A.size() && j<D.size() && roomsReq<K){
            if(A.get(i)<D.get(j)){
                roomsReq++;
                i++;
            }
            else{
                roomsReq--;
                j++;
            }
        }
        if(roomsReq>K)
            return false;
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
