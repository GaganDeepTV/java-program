package IsARelationship.staticmember;

public class child extends parent {
	//static context
	public static void m1() {
		System.out.println(x);
	}
	//non-static context
	public void m2() {
		System.out.println(x);
	}
	
	

}
