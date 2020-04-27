
package PB_1011;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double volume, radius, pi;
        Scanner input = new Scanner(System.in);
        
        radius = input.nextDouble();
        pi = 3.14159;
        volume = ((4.0/3)*(pi*Math.pow(radius, 3)));
        System.out.printf("VOLUME = %.3f\n",volume);
    }
}
