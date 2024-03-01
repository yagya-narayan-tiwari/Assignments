class minMax{

public static void main(String args[]){

int arr[] = {5,4,3,9,1,7,9};

int min = arr[0];
int max = arr[0];

for(int i=0 ; i<arr.length;i++){

if(min>arr[i]){

min = arr[i];

}

if(max<arr[i]){
 
   max = arr[i];
}


}

System.out.println("max of the array is : " + max);
//System.out.println();
System.out.println("min of the array is : " + min);




}




}