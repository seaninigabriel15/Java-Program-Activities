package Java;

import java.util.Scanner;

public class reverse {

    public static void main(String[ ] args){
        String input , reversetxt ="";
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Enter Text: ");
        input = scan.nextLine();
        int length = input.length();

        for(int i = length - 1 ; i >= 0 ; --i)
        reversetxt = reversetxt + input.charAt(i);
        System.out.println("reverse is : "+ reversetxt);
    }

    


    
}
