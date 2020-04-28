
package PB_1016;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int distance, minutes;
        Scanner input = new Scanner(System.in);
        
        distance = input.nextInt();
        
        minutes = distance*2;
        System.out.println(minutes+" minutos");
        
    }
}
