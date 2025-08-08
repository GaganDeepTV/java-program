package IsARelationship.nonstaticmember;

public class main {
	public static void main(String[] args){
		parent p1=new parent();
		System.out.println(p1.x);
		//using parent reference we can not access child member
		//System.out.println(p1.y);//cTE
		
		child c1=new child();
		System.out.println(c1.x);
		System.out.println(c1.y);
	}
}
