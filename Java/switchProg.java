package Java;
import java.util.Scanner;



public class switchProg {

    public static void main(String[] args) {

        double a,b, ans;
        char choice;
        Scanner scan = new Scanner(System.in);

        System.out.println("[A]add"+ "[B]sub"+ "[C]mul"+"[D]div");
        System.out.println("Enter your choice");
        choice = scan.next().charAt(0);
        System.out.println("Enter your 1st number: ");
        a = scan.nextDouble();
        System.out.println("Enter your 2nd number: ");
        b = scan.nextDouble();

        switch (choice) {
            case 'A':
                ans = a + b;
                System.out.println("Sum is :" + ans);
                break;
            case 'B':
                ans = a - b;
                System.out.println("Difference is :" + ans);
                break;
            case 'C':
                ans = a * b;
                System.out.println("Answer is :" + ans);
                break;
            case 'D':
                ans = a / b;
                System.out.println("Answer is :" + ans);
                break;

            default:
            System.out.println("Invalid operator!");
                break;
        }

        
    }
    
}
