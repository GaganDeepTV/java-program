package IsARelationship.objectloading.userdefinedparameteraisedconst;

public class child extends parent{
	
	//we get CTE if we call parent const explicitly : parent const is parameterized 
	child(int x){
		super(x);
	}
	public static void main(String[] args) {
		child c=new child(10);
	}

}
