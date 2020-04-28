
package PB_1015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, y1, x2, y2, distance;
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        
        x2= input.nextDouble();
        y2 = input.nextDouble();
        double add = (Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2));
        distance = Math.sqrt(add);
        System.out.printf("%.4f\n",distance);
    }
}
