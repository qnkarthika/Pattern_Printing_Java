Input: N=5
Output:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        
        for(int i=n;i>=1;i--){
             for(int j=1;j<=i;j++){
                System.out.print(j+" ");
             }
                System.out.println();
        }
    }
}
