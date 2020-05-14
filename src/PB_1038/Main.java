
package PB_1038;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int product_code, quantity;
        double totalPrice;
        product_code = input.nextInt();
        quantity = input.nextInt();
        
        if(product_code == 1){
            totalPrice = (4.00 * quantity);
            System.out.printf("Total: R$ %.2f\n",totalPrice);
        }else if(product_code == 2){
            totalPrice = (4.50 * quantity);
            System.out.printf("Total: R$ %.2f\n",totalPrice);
        }else if(product_code == 3){
            totalPrice = (5.00 * quantity);
            System.out.printf("Total: R$ %.2f\n",totalPrice);
        
        }else if(product_code == 4){
            totalPrice = (2.00 * quantity);
            System.out.printf("Total: R$ %.2f\n",totalPrice);
        
        }else if(product_code == 5){
            totalPrice = (1.50 * quantity);
            System.out.printf("Total: R$ %.2f\n",totalPrice);
        }
    }
}
