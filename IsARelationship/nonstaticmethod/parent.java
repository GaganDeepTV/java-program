package IsARelationship.nonstaticmethod;

public class parent {
	
	public void m1() {
		System.out.println("executing m1");
	}
	public void m2() {
		m1();
	}
	public static void m3() {
		//non static can not accessed
		//m1();CTE
	}

}
