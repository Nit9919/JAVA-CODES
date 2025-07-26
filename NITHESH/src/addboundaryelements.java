import java.sql.SQLOutput;
import java.util.Scanner;
public class addboundaryelements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr={{1,2,3},
                {3 ,2 ,1},
                {4,2,1}};
        int row=arr.length;
        int col=arr[0].length;
        int sum=0;
        for(int i=0;i<col;i++){
             sum+=arr[0][i];
              }
        for(int j=0;j<col;j++){
            sum+=arr[row-1][j];
        }
        for(int k=1;k<row-1;k++){
            sum+=arr[k][0];
            sum+=arr[k][row-1];
        }
        System.out.println(sum);

            }

    }

