class arrayAvg{

public static void main(String args[]){


int arr[] = {5,4,3,9,1,7,9};

int i=0;
double sum = 0;

while(i<arr.length){

sum += arr[i];

i++;

}

double avg = sum / arr.length;

System.out.print("the average of the elements will be : " + avg);


}

}