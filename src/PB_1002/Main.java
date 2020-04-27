
package PB_1002;


import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();
        double pi = 3.14159;
        double A = pi*(R*R);
        
        System.out.printf("A=%.4f\n",A );
    }
}
