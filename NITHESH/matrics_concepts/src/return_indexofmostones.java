import java.util.Scanner;
public class return_indexofmostones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                arr[i][j] = sc.nextInt();
            }
        }
        int one=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>one){
                one=count;
                index=i+1;
            }
        }
        System.out.println(index);
    }
}
