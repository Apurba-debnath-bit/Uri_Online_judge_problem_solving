
package PB_1017;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int spent_time, speed_per_hour, Total_Km;
        double total_li;
        Scanner input = new Scanner(System.in);
        spent_time = input.nextInt();
        speed_per_hour = input.nextInt();
        Total_Km = (spent_time*speed_per_hour);
        
        total_li = ((double)Total_Km/12);
        System.out.printf("%.3f\n", total_li);
    }
}
