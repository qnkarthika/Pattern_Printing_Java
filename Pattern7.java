Input: N=3
Output:
    *
  * * *
* * * * *

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            for(int l=1;l<=n-i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
