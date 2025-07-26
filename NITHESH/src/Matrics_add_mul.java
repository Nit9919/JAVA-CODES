import java.util.Scanner;
public class Matrics_add_mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=1;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                sum *= arr[i][j];
            }
        }
        System.out.print(sum);
            }
        }
