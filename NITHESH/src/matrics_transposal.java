import java.util.Scanner;
public class matrics_transposal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[][] transpose=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                transpose[j][i]=arr[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
