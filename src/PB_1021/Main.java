
package PB_1021;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double note = input.nextDouble();
        
        ArrayList<Integer> pos_notes = new ArrayList<Integer>();
        ArrayList<Double> pos_coins = new ArrayList<Double>();
       
        pos_notes.add(100);
        pos_notes.add(50);
        pos_notes.add(20);
        pos_notes.add(10);
        pos_notes.add(5);
        pos_notes.add(2);
        
        pos_coins.add(1.00);
        pos_coins.add(0.50);
        pos_coins.add(0.25);
        pos_coins.add(0.10);
        pos_coins.add(0.05);
        pos_coins.add(0.01);
       
        System.out.println("NOTAS: ");
        for(int x: pos_notes){
            
            System.out.printf("%d nota(s) de R$ %.2f\n",(int)(note/x),(double)x);
            note = note%x;
        
        }
        note = note;
        System.out.println("MOEDAS: ");
        for(double y: pos_coins){
           
            System.out.printf("%d moeda(s) de R$ %.2f \n",(int)(note/y), y);
            note = note%y;
        
        }

    }
}
