class room{

	double length;
	double height;
        double breadth;

// default constructor
room(){

}


room(double l , double h , double b){

	this.length = l;
	this.height = h;
	this.breadth = b;
	
}

double volume(){
  return  length*height*breadth;
}
	public static void main(String args[]){
 	
	room r1 = new room(10,20,30);
	
	System.out.println("the volume of the room will be : " +  r1.volume());
      


}

}