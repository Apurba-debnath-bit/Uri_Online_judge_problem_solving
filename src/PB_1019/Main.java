
package PB_1019;

import java.util.Scanner;


public class Main {
    //Remember the word expressed(as like decomposed) the int value second
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int h, m;
        h = 0;
        m = 0;
        h = s/3600;
        s = s%3600;
        m = s/60;
        s = s%60;
        System.out.printf("%d:%d:%d\n",h,m,s);
        
        
        
    }
 
}
