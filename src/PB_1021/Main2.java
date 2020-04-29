
package PB_1021;

import java.util.Scanner;

//To submit in judge class name sould be-> Main
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double note = input.nextDouble();
        
        System.out.println("NOTAS: ");
        
        System.out.println((int)(note/100) + " nota(s) de R$ 100.00");
        note = note%100;
        System.out.println((int)(note/50) + " nota(s) de R$ 50.00");
        note = note%50;
        System.out.println((int)(note/20) + " nota(s) de R$ 20.00");
        note = note%20;
        System.out.println((int)(note/10) + " nota(s) de R$ 10.00");
        note = note%10;
        System.out.println((int)(note/5) + " nota(s) de R$ 5.00");
        note = note%5;
        System.out.println((int)(note/2) + " nota(s) de R$ 2.00");
        note = note%2;
        
        System.out.println("MOEDAS: ");
        
        System.out.println((int)(note/1.00) + " moeda(s) de R$ 1.00");
        note = note%1;
        System.out.println((int)(note/0.50) + " moeda(s) de R$ 0.50");
        note = note%0.50;
        System.out.println((int)(note/0.25) + " moeda(s) de R$ 0.25");
        note = note%0.25;
        System.out.println((int)(note/0.10) + " moeda(s) de R$ 0.10");
        note = note%0.10;
        System.out.println((int)(note/0.05) + " moeda(s) de R$ 0.05");
        note = note%0.05;
        System.out.println((int)(note/0.01) + " moeda(s) de R$ 0.01");
        
        
    }
}
