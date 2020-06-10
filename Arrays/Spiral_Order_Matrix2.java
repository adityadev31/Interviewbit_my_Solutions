public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
        
        // INITIALIZING ARRAYLIST
        for(int i=0; i<A; i++){
            x.add(new ArrayList<Integer>());
            for(int j=0; j<A; j++){
                x.get(i).add(0);
            }
        }
        
        // SETTING BOUNDARIES
        int topWall = 0;
        int rightWall = A-1;
        int bottomWall = A-1;
        int leftWall = 0;
        int counter = 0;
        
        while(leftWall<=rightWall && topWall<=bottomWall){
            // top
            if(topWall<=bottomWall){
                for(int j=leftWall; j<=rightWall; j++){ x.get(topWall).set(j, ++counter); }
                topWall++;
            }
            // right
            if(leftWall<=rightWall){
                for(int i=topWall; i<=bottomWall; i++){ x.get(i).set(rightWall, ++counter); }
                rightWall--;
            }
            // bottom
            if(topWall<=bottomWall){
                for(int j=rightWall; j>=leftWall; j--){ x.get(bottomWall).set(j, ++counter); }
                bottomWall--;
            }
            // left
            if(leftWall<=rightWall){
                for(int i=bottomWall; i>=topWall; i--){ x.get(i).set(leftWall, ++counter); }
                leftWall++;
            }
        }
        
        return x;
    }
}
