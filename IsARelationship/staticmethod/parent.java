package IsARelationship.staticmethod;

public class parent {
	
	//static method from parent class
	public static void m1() {
		System.out.println("m1");
	}
	public void m2() {
		m1();
	}
	public static void main(String[] args){
		m1();
	}
}
