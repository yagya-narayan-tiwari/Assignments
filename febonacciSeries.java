import java.util.Scanner;
class feb{


public static void main(String args[]){

Scanner input = new Scanner(System.in);
System.out.print("enter the number for febonacci series : ");
int num = input.nextInt();

febo(num);



}


public static void febo(int num){

int first = 0 ; 
int second = 1 ; 

if(num<0){

return ;

}

System.out.print("0 1 ");

if(num==0){return;}
if(num==1){
System.out.print("0 1 ");
return;
}

int nextNum = 0;

while(nextNum < num){

nextNum = first + second;

System.out.print(nextNum + " " );

first = second;
second = nextNum;


}



}















}