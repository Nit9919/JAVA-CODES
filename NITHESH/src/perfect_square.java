import java.sql.SQLOutput;
import java.util.Scanner;
public class perfect_square {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={34};
        int count=0;
        for(int i=0;i<arr.length;i++){
            int m=arr[i];
            if(m>0){
                int n=(int)Math.sqrt(m);
                System.out.print("No of perfect squares are:"+n+" ");
                break;
//                if(n*n==m){
//                    count++;
//                }
            }
        }
    }
}
