// Time : O( ROW x COL ), Space: O( ROW ). 

package Matrix.Unique_Rows_in_Boolean_Matrix;
import java.util.HashSet;
public class using_HashSet {

    public static void printArray(int arr[][], int row,int col) {        
        HashSet<String> set = new HashSet<String>();
        for(int i = 0; i < row; i++) {
            String s = "";
            
            for(int j = 0; j < col; j++) 
                s += String.valueOf(arr[i][j]);
            
            if(!set.contains(s)) {
                set.add(s);
                System.out.println(s);
                
            }
        }
    }
    // Driver code
    public static void main(String[] args) {   
        int arr[][] = { {0, 1, 0, 0, 1},
                        {1, 0, 1, 1, 0},
                        {0, 1, 0, 0, 1},
                        {1, 1, 1, 0, 0} };
        
        printArray(arr, 4, 5);
    }
}

