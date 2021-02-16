package Java;

import java.util.Scanner;

public class Box {
    public static void main(String[] args){
        boxString("Programming is Fun");

        // String boxString;
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter A String");
        // boxString = scan.nextLine();

    }
    public static void boxString(String contents){
       
        int n = contents.length();
        
        for(int i=0; i < n + 2; i++){
            System.out.print("-");
        }
        System.out.println();
        
        System.out.println("!" + contents + "!");

        for(int i=0; i < n + 2; i++){
            System.out.print("-");
        }
        System.out.println();
     }

    
}
