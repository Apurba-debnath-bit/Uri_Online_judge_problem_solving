
package PB_1012;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A,B,C;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        double pi = 3.14159;
        double area_of_triangle, area_of_Circle, area_of_trapezium, area_of_square, area_of_rectangle;
        area_of_triangle = 0.5*A*C;
        area_of_Circle = pi*Math.pow(C, 2);
        area_of_trapezium = (((A+B)/2)*C);
        area_of_square = Math.pow(B,2);
        area_of_rectangle = A*B;
        
        System.out.printf("TRIANGULO: %.3f\n", area_of_triangle);
        System.out.printf("CIRCULO: %.3f\n", area_of_Circle);
        System.out.printf("TRAPEZIO: %.3f\n", area_of_trapezium);
        System.out.printf("QUADRADO: %.3f\n", area_of_square);
        System.out.printf("RETANGULO: %.3f\n", area_of_rectangle);
    }
}
