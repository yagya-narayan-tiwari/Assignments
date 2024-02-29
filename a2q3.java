class box{

	 double height;
	double width;
	double breadth;

 // default constructor should be there all the time

box(){}


box(double h , double w , double b){

	this.height = h;
	this.width = w;
	this.breadth = b;
}


// Methods

double volume(){

  return height*width*breadth;
}

double surfaceArea(){

return 2*(height*width + width*breadth + breadth*height);

}

// to dispaly the volume using method

void volume1(){

double volume = height*width*breadth;

System.out.println("the volume of the box is : " + volume);


}

public static void main(String args[]){


box b1 = new box(10,12,20);

System.out.println("The volume of the box is : " + b1.volume());

System.out.println("The surface Area of the box is : " + b1.surfaceArea());

box b2 = new box(15,10,20);

b2.volume1();



}





}