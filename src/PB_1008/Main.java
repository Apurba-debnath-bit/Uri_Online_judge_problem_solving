
package PB_1008;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num, work_hour;
        double salary_per_hour, total_salary;
        
        num = input.nextInt();
        work_hour = input.nextInt();
        salary_per_hour = input.nextDouble();
        
        total_salary = salary_per_hour*work_hour;
        
        System.out.printf("NUMBER = %d\n",num);
        System.out.printf("SALARY = U$ %.2f\n",total_salary);
        
        
        
    }
}
