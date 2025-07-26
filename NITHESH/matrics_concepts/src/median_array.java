import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;
public class median_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int avg=0;
        int sum=0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum+=arr[i];
            }

        Arrays.sort(arr);
        for(int c:arr){
            System.out.print(c+" ");
        }
        System.out.println();
        int m=arr.length/2;
        int o=m-1;
        if(n%2==0){
            avg=m+o/2;
            System.out.print(avg);
        }
        else{
                int res=sum/n;
                System.out.println(res);
            }
        }
    }

