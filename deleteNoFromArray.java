// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner input = new Scanner(System.in);
        
        int arr1[] = {110,50,400,20,-10};
        System.out.print("enter the number that you want to delete : ");
        int num = input.nextInt();
        
       
        // System.out.print("no of occarances : " + occ);
        

        
        int newArr[] = newArr(arr1 , num);
        printArr(newArr);
        
   
}

public static int occ(int arr[] , int num){
    int occ = 0 ;
    int i=0;
    while(i<arr.length){
        if(arr[i] == num){
            
        occ++;
        }
        i++;
    }
    return occ;
}

public static int [] newArr(int arr[] , int num){
    int occ = occ(arr , num);
     int newSize = arr.length - occ;
     int [] newArr = new int[newSize];
   int i = 0 , j= 0;
   
   while(i<arr.length){
       if(arr[i]!=num){
           newArr[j] = arr[i];
           j++;
       }
       i++;
   }
   
   return newArr;

}

public static void printArr(int arr[]){
    int i=0;
    while(i<arr.length){
        System.out.print(arr[i] + " ");
        i++;
    }
}

}