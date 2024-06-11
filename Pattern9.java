Input: N=5
Output:
1 3 6 10 15
2 5 9 14
4 8 13
7 12
11
  
import java.util.*;
class Main {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int start=1;
     int step=2;
     int x,y;
     for(int i=1;i<=n;i++){
           x=start;
           y=step;
           for(int j=0;j<=n-i;j++){
               System.out.print(x+" ");
               x+=y;
               y++;
           }
       System.out.println();
       start+=i;
       step++;
    }

  }
}
