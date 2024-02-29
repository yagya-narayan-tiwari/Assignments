// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
   
    //  System.out.println("Hello, World!");
    
    Scanner input = new Scanner(System.in);
    System.out.print("enter the 1st number : ");
    int num1 = input.nextInt();
    System.out.print("enter the 2nd number : ");
    int num2 = input.nextInt();
    
    System.out.println("1 : addition");
        System.out.println("2 : substraction");

    System.out.println("3 : multiple");
    System.out.println("4 : divide");
    
    System.out.print("enter your choice : ");
    int choice = input.nextInt();
    
    
    switch(choice){
        case 1 : {
            System.out.print("the sum of the numbers : " + (num1 + num2));
            break;
        }
        case 2 : {
            System.out.print("the substaction of the numbers : " + (num1 - num2));
            break;
        }
        case 3 : {
            System.out.print("the multiplication of the numbers : " + (num1 * num2));
            break;
        }
        case 4 : {
            System.out.print("the division of the numbers : " + (num1 / num2));
            break;
        }
        default : {
            System.out.print("enter valid choice ");
        }
    }

    }
    
    
    
    
    
    
    
    
    
    
    
}