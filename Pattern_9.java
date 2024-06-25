
Input : 4
Output:
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 
  
  
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int size = n * 2 - 1;
        int[][] arr = new int[size][size];
        
        int copy = n;
        for (int layer = 0; layer < n; layer++) {
            int start = layer;
            int end = size - layer - 1;
            // Fill top row
            for (int i = start; i <= end; i++) {
                arr[start][i] = copy;
            }
            // Fill bottom row
            for (int i = start; i <= end; i++) {
                arr[end][i] = copy;
            }
            // Fill left column
            for (int i = start; i <= end; i++) {
                arr[i][start] = copy;
            }
            // Fill right column
            for (int i = start; i <= end; i++) {
                arr[i][end] = copy;
            }
            copy--;
        }
        
        // Print the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
