// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Try https://programiz.pro");
        int arr[] = {1,2,3,3,3,1};
        boolean isPalindrome  = isPalindrome(arr);
        if(isPalindrome){
            System.out.print("palindrome");
        }
        else{
            System.out.print("not palindrome");
        }
        
    }
    
    
    public static boolean isPalindrome(int []arr){
    int i=0;
    while(i<arr.length/2){
        if(arr[i] != arr[(arr.length-1) - i]){
            return false;
        }
        i++;
    }
    return true;
}
}