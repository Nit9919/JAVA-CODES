import java.util.Scanner;
public class kaartech_question {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={3,5,7};
        int res[]=new int[arr.length];
        int n=arr.length;
        for(int i=0;i<n;i++){
            res[i]=arr[i]*arr[i];
        }
        for(int a:res)
        System.out.print(a+" ");
        String s=new String[arr.length];
        

    }
}
