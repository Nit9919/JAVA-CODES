import java.util.Scanner;
public class leap_year {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0|| n%100==0){
            System.out.println("Leap year");
        }
        else{
            int res=n%4;
            System.out.println("Not an leap year");
            System.out.println("after leap year occurence count: "+res);
        }
    }
}
