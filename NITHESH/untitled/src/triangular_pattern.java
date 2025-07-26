                   //RIGHT TRIANGLE //

import java.util.Scanner;
//public class triangular_pattern {
//    public static void main(String[] args){
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }
//}

                   //INVERTED RIGHT TRIANGLE//
//
//public class triangular_pattern {
//    public static void main(String[] args){
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=5;j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }
//}

                  //           PYRAMID PATTERN               //

                   public class triangular_pattern {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}