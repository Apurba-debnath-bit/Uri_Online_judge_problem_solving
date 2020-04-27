
package PB_1010;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p1_Code, p1_UnitPrice,p2_Code, p2_UnitPrice ;
        double per_UnitPrice_p1, per_UnitPrice_p2, totalPrice;
        
        p1_Code = input.nextInt();
        p1_UnitPrice = input.nextInt();
        per_UnitPrice_p1 = input.nextDouble();
        
        p2_Code = input.nextInt();
        p2_UnitPrice = input.nextInt();
        per_UnitPrice_p2 = input.nextDouble();
        
        totalPrice = ((p1_UnitPrice * per_UnitPrice_p1)+(p2_UnitPrice*per_UnitPrice_p2));
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",totalPrice);
    }
}
