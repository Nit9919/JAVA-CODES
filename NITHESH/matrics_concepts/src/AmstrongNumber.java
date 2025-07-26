import java.util.Scanner;
public class AmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int orignum=sc.nextInt();
        int res=0;
        int n=String.valueOf(num).length();
        while (num!= 0) {
        int digit=num%10;
        res+=Math.pow(digit,n);
        num/=10;
        }
        if(res==orignum){
            System.out.println("amstrong number");
        }
        else{
            System.out.println("Not an amstrong number");
        }

    }
}
