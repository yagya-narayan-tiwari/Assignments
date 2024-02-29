class person{


  String name;
  double height;
  double weight;
  int age;

person(){}

person(String n , double h){
   this.name = n;
	this.height = h;

}

person(String n , double h , double w , int a){
	this.name = n;
	this.weight = w;
	this.height = h;
	this.age = a;
}


//method to display the details of the person : 


void display(){

System.out.println("Name : " + name);
System.out.println("Height in ft : " + height);
System.out.println("Weight in kg : " + weight);
System.out.println("Age : " + age);


}

public static void main(String args[]){

person p1  = new person("Rahul Tiwari" , 6 , 60.5 , 23 );
p1.display();


}
































}