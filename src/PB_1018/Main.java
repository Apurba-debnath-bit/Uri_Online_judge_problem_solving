
package PB_1018;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        // the banknotes are: 100,50,20,10,5,2,1
        //comment are for input value:576
        System.out.println(x);
        System.out.println( x/100 + " nota(s) de R$ 100,00");//500 peye gechi
        x = x % 100;//76
        System.out.println(x/50 + " nota(s) de R$ 50,00");//50 takar 1 ta note
        x= x % 50; //26
        System.out.println(x/20 + " nota(s) de R$ 20,00");//20 takar 1 ta note
        x= x % 20; //6
        System.out.println(x/10 + " nota(s) de R$ 10,00");//10 takar 0 ta note(as it is return double)
        x= x % 10; //6
        System.out.println(x/5 + " nota(s) de R$ 5,00");//5 takar 1 ta note
        x= x % 5; //1
        System.out.println(x/2 + " nota(s) de R$ 2,00");//2 takar 0 ta note(as it is return double)
        x= x % 2; //1
        System.out.println(x/1 + " nota(s) de R$ 1,00");//1 takar 1 ta note
        
        
        
    }
}
