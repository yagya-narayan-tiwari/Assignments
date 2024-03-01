// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        
        int arr1[] = {110,50,400,20,-10};
      
       boolean isIncreasing = isIncreasing(arr1);
      boolean isDecreasing = isDcreasing(arr1);
      
      if(isIncreasing || isDecreasing){
          System.out.print("Array is sorted");
      }
      else{
        System.out.print("Array is not sorted");

      }

      
    }
    
public static boolean isDcreasing(int arr1[]){
    
        int i = 1;
        while(i<arr1.length){
            if(arr1[i]>arr1[i-1]){
                return false;
            }
            i++;
        }
        
        return true;
}
public static boolean isIncreasing(int arr1[]){
    
        int i = 1;
        while(i<arr1.length){
            if(arr1[i]<arr1[i-1]){
                return false;
            }
            i++;
        }
        
        return true;
}
}