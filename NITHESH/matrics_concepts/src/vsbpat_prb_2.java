//to print max among the two different array!
//14/07/25 evening test problem.
import java.util.Scanner;
import java.util.Arrays;
public class vsbpat_prb_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int max1 = arr[arr.length-1];
        int max2 = arr1[arr1.length-1];
        if (max1 > max2) {
            System.out.println(max1);
        } else {
            System.out.println(max2);
        }
    }
}
