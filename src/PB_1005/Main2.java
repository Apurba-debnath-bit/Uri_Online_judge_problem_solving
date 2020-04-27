
package PB_1005;

import java.io.IOException;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double  A,B, Avg;
        int count = 0;
        int i = 0;
        do{
           System.out.println("Enter a float num: ");
           A = input.nextDouble();
           while( i == 0 ){
               if(A<0 || A>10){
                   System.out.println("OOps!! You have to enter between 0 to 10!!");
               }
               i++;
           };
           count++;
        }while(count == 0);
    }
}
