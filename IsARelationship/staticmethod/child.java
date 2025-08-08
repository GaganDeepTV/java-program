package IsARelationship.staticmethod;

public class child extends parent{
	
	public static void demo() {
		//child class accessing static method by parent class
		m1();
		
	}
	//non static method
	public void demo2() {
		
		m1();
	}
	

}
