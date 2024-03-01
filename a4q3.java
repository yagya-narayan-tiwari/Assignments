import java.util.Scanner;

class sumOfMultiples{



public static void main(String args[]){


Scanner input = new Scanner(System.in);

System.out.print("enter the number : ");

int n  = input.nextInt();

int sum  = 0;

for(int i=1;i<=n ;i++){

int t = 2*(i-1);
// System.out.println(t);

if(t%3==0){
 // System.out.print(t + " " );
  sum +=t;

}

}

System.out.print("the sum = " + sum);



}



}