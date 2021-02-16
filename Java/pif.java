package Java;

import java.util.Scanner;

public class pif {

    public static void main(String[] args){

        String a[] = new String[3];
        Scanner scan = new Scanner(System.in);

        System.out.print("Please Enter text: ");
       
        for(int i=0; i<a.length; i++){
            a[i] = scan.nextLine();
        }for (String i:a){
            System.out.print(i);
        }
    }
    
}
