
package PB_1035;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        int sum1 = C+D;
        int sum2 = A+B;
        
        if(B > C && D > A && sum1 > sum2 && C >= 0 && D >= 0 && A%2 == 0){
            System.out.println("Valores aceitos");
        }else{
        
            System.out.println("Valores nao aceitos");
        }
        
        
    }
}
