import java.util.Scanner;
public class twosum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         int sum=0;
         boolean flag=false;
         int tar=sc.nextInt();
         for(int i=0;i<n-1;i++){
             for(int j=i+1;j<n;j++){
                sum+= arr[i]+arr[j];
                if(sum==tar){
                    System.out.println("target found ");

                }
                else{
                    System.out.println("target not found");
                    sum=0;
                }
             }
             break;
         }
    }
}
