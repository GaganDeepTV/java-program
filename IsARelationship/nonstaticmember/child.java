package IsARelationship.nonstaticmember;

public class child extends parent 
{

	public void test() {
		//accesssing parent class non-static variable
		System.out.println(x);
	
	}
	public void m1() {
		System.out.println(x);
	}

}
