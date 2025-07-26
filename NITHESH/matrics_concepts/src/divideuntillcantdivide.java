
import java.util.Scanner;
public class divideuntillcantdivide {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        while(m!=0){
            int k=n/m;
            m+=k;
        }

    }
}
