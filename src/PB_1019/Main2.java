
package PB_1019;

import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        //This is wrong program as question in general:
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int h, m;
        //(inform it decomposed in or expressed in hours:munites: second)
        h = s/3600;
        m = s/60;
        System.out.printf("%d : %d: %d\n", h, m, s);
    }
}
