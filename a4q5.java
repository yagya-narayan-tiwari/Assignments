// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class isEqual {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        
        int arr1[][] = {{1,1},{2,2}};
        int arr2[][] = {{1,1},{2,3}};
        boolean isEqual = isEqual(arr1 , arr2);
        
        if(isEqual){
            System.out.print("Matrices are equal");
        }
        else{
            System.out.print("Matrices are not equal ");
        }
        
      
    }
    
public static boolean isEqual(int arr1[][] , int arr2[][]){
      for(int i = 0 ;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                
                if(arr1[i][j]!=arr2[i][j]){
                    return false;
                }
            }
        }
        
        return true;
}
}