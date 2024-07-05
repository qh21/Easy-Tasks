package javaapplication;
import java.util.Scanner;
public class JavaApplication {

    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    String yourName;

    System.out.print("Please Enter Your Name:\t"); 
    yourName = input.nextLine();   
    System.out.println("\nHello "+yourName);    
    }
    
}
