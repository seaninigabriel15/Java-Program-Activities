package Java;

import java.util.Scanner;

public class InputNumber {

    public static void main(String[] artgs){

        double a,b,sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input First Number");
        a= scan.nextDouble();
        System.out.println("Input Second Number");
        b = scan.nextDouble();
        sum = a + b;
        System.out.println("The sum is : " + sum);
    }
    
}
