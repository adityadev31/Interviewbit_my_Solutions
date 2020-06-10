import java.util.*;

public class Main {
    
    public static void printSpiral(int[][] arr){
        int topBorder = 0;
        int rightBorder = arr[0].length-1;
        int bottomBorder = arr.length-1;
        int leftBorder = 0;
        
        while(topBorder<=bottomBorder && leftBorder<=rightBorder){
            // print top 
            for(int j=leftBorder; j<=rightBorder; j++){ System.out.print(arr[topBorder][j] + " "); }
            topBorder++;
            
            // print right 
            for(int i=topBorder; i<=bottomBorder; i++){ System.out.print(arr[i][rightBorder] + " "); }
            rightBorder--;
            
            // print bottom 
            for(int j=rightBorder; j>=leftBorder; j--){ System.out.print(arr[bottomBorder][j] + " "); }
            bottomBorder--;
            
            // print left 
            for(int i=bottomBorder; i>=topBorder; i--){ System.out.print(arr[i][leftBorder] + " "); }
            leftBorder++;
        }
    }
    
    public static void main(String[] args) throws Exception {
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        printSpiral(arr);
    }
}

// ans -> 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
