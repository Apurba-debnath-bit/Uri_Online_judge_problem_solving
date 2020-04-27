
package PB_1009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName; double fixedSalary, totalSale, finalSalary;
        firstName = input.next();
        fixedSalary = input.nextDouble();
        totalSale = input.nextDouble();
        finalSalary = (fixedSalary + (totalSale*0.15));
        System.out.printf("TOTAL = R$ %.2f\n" , finalSalary);
    }
}
