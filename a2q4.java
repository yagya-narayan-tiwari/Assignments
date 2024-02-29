class vehicle{

	long price;
 	String color;
        String companyName;
 	int model;

vehicle(){}

vehicle(long p , String c , String cn , int m){

	this.price = p;
        this.color = c;
	this.companyName = cn;
	this.model = m;
}


// Method to display the details :--


void display(){

	System.out.println("The Price of the vehicle is : " + price);
	System.out.println("The color of the vehicle is : " + color);
	System.out.println("The company name of the vehicle is : " + companyName);
	System.out.println("The model of the vehicle is : " + model);


}


public static void main(String args[]){

vehicle v1 = new vehicle(1500000 , "Black" , "Honda varna" , 2018);

v1.display();

}


}