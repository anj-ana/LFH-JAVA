package mypack;

class TestStudent{
	 String Name;
	 int Rollnumber;
	  void showData(String name,int rollnumber) {
	    	 Name=name;
	    	 Rollnumber=rollnumber;
	    	}
	  void display() {
		  System.out.println(Name+" "+Rollnumber);
	  }
	    
}
class Student {
	public static void main(String[] args) {
		
	    TestStudent s1 = new TestStudent();
	    TestStudent s2 = new TestStudent();
	    s1.showData("Anju",12);
	    s2.showData("Anu",34);
	    s1.display();
	    s2.display();
	   
	   }
	
}

	
	


 

 

