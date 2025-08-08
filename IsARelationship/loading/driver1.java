package IsARelationship.loading;

public class driver1 {

	static {
		System.out.println("driver 1 loading");
	}
	public static void main(String[] args) {
		{
			System.out.println("main started");
			System.out.println(parent.x);
			System.out.println("main ended");
			
		}
	}
}
