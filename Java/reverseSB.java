package Java;

import java.util.Scanner;

public class reverseSB {

    public static void main(String[] args){

        String name;
        StringBuilder sbReverse = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a String to Reverse");
        name = scan.nextLine();
        sbReverse.append(name);
        sbReverse=sbReverse.reverse();
        System.out.println("Reverse is: " + sbReverse);



    }
    
}
