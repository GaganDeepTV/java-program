package IsARelationship.nonstaticmethod;

public class child  extends parent {
	public static void test() {
		//INSIDE parent non static context
		//m1();//CTE
	}
	public  void test2() {
		m1();
	}
	
}
