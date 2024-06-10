Input: N=5
Output:
*********
 *******
  *****
   ***
    *


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int i=0,j=0;
        for(i=1,j=0;i<=n;i++,j++){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int m=1;m<=2*n-i-j;m++){
                System.out.print("*");
            }
            for(int l=1;l<i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
