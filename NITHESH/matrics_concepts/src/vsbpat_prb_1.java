//14/07/2025 Even test problem

import java.util.Scanner;
public class vsbpat_prb_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2==0 && arr[i]>(k*2)){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
