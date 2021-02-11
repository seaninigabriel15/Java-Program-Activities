package Java;

import java.util.Scanner;

public class InputString {

    public static void main(String[] args){
        String nameStr; 
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Name : ");
        nameStr = scan.nextLine();
        System.out.println("HI " + nameStr + ":)");
        

    }
    
}
