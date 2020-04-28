
package PB_1020;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int days , months, years;
        Scanner input = new Scanner(System.in);
        days = input.nextInt();//400 mane koto bochor koto month r koto din(decomposed korbo)
        months = 0;
        years = 0;
        years = days/365;// as we know: 365days in a year(as question also)
        //400/365 =1 (35)
        days = days%365;// days = 35 days;
        months = days/30;
        days = days%30;//35%35 = 1 day
        //Printing values as question:
        System.out.printf("%d ano(s)\n",years);
        System.out.printf("%d mes(es)\n",months);
        System.out.printf("%d dia(s)\n",days);
        
    }
}
