
package PB_1014;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double avgCon, total_fuel_Spent;
        int total_distance;
        Scanner input = new Scanner(System.in);
        
        total_distance = input.nextInt();
        total_fuel_Spent = input.nextDouble();
        
        avgCon = total_distance/total_fuel_Spent;
        
        System.out.printf("%.3f km/l\n", avgCon);
    }
}
