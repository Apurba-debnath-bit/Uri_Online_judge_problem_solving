
package PB_1013;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A,B,C, Max;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        Max = A;
        
        if(B > Max )
            Max = B;
        if(C > Max)
            Max = C;
        System.out.println(Max+" eh o maior");
           
        
    }
}
