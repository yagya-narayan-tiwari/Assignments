class Student{


	String name;
        double phyMarks;
	double chemMarks;
	double mathMarks;
	

	Student(){}

	Student(String n){
  	this.name = n;
	}

//to set the values/ marks of the subjects

	void setMarks(double phy , double chem , double math){
          if(phy<0 || chem<0|| math<0){
 		phyMarks=0;
		chemMarks = 0;
		mathMarks = 0;
		}
	else{
            phyMarks = phy;	
	    chemMarks = chem;
	    mathMarks = math;
}



}

// function to display the name of the student

void displayName(){
System.out.print("the name of the student is : " + this.name);
}

//method to find out the average of the marks

double Avg(){
	return (phyMarks+chemMarks+mathMarks)/3;
}












// main method is starting from here

public static void main(String args[]){

Student s1 = new Student("rahul");
s1.setMarks(45,55,78);
System.out.println(s1.phyMarks);
s1.displayName();
System.out.println("the average of the marks will be : " + s1.Avg());


}

}