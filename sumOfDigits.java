
import java.util.Scanner;
class sumOfDigits{
    
    public static void main(String args[]){
        Scanner input  = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = input.nextInt();
        sum(num);
        
        // return 0;
    }
    
    public static void sum(int num){
        int sum = 0;
        while(num !=0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("the sum of the digits is : " + sum);
        
    }
}