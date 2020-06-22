package inheritance;

public class TestEmp{

	public static void main(String[] args) {
		Person p=new Person("Ajith");
		Employee e=new Employee("Ajay",10000.50,2014,"y456");
		System.out.println(p);
		System.out.println(e);
	}

}
