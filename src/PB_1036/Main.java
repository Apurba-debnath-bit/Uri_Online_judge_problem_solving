
package PB_1036;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A, B, C, D;
         A = input.nextDouble();
         B = input.nextDouble();
         C = input.nextDouble();
         
         D = ((Math.pow(B, 2))- (4*(A)*(C)));
         
         if(A !=0 && D > 0){
             double x, y;
             D = Math.sqrt(D);
             x = ((-B + D) / (2*A));
             y = ((-B - D) / (2*A));
             System.out.printf("R1 = %.5f\n", x);
             System.out.printf("R2 = %.5f\n", y);
         }else{
             System.out.println("Impossivel calcular");
         }
    }
}
