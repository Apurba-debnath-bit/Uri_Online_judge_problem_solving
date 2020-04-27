
package PB_1013;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  Max;
        int[] check = new int[3];
        
       
        
        for (int i = 0; i <= 2; i++) {
            check[i] = input.nextInt();
        }
       
        
        Max = check[0];
       
        for(int x: check){
            if(x > Max){
                Max = x;
                //love;
            }
        }        
        System.out.println(Max+" eh o maior");
    }
}
