package IsARelationship.objectloading.defaultconstructor;

public class main {
	public static void main(String[] args) {
		child c=new child();
		//accessing parent variable
		System.out.println(c.x);
		
		//accessing child variable
		System.out.println(c.y);
	}

}
