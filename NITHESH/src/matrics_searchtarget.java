
import java.util.Scanner;
public class matrics_searchtarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
            int tar = sc.nextInt();
            int m = -1;
            boolean found = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                  if(arr[i][j]==tar){
                      found=true;
                      m=i;
                      m=i;
                      break;
                  }
                }
                if(found) break;
            }
            if(found==true){
                System.out.println("("+m+","+m+")");
            }
            else{
                System.out.println("Not found");
            }
        }
    }

