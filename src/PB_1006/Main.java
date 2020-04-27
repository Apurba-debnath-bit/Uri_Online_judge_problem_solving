
package PB_1006;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A,B,C, Avg;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        Avg = ((A*2 + B*3 + C*5)/(2+3+5));
        System.out.printf("MEDIA = %.1f\n" , Avg);
        
    }
}
