import java.util.Comparator;

public class Employee implements Comparator<Object> {

	int id;
	String name;
	int age;
	long phoneNumber;

	public Employee(int id, String name, int age, long phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int compare(Object o1, Object o2) {

		return 0;
	}

	public Employee() {

	}

}
