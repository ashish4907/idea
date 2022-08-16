import java.util.Comparator;

public class Employee implements Comparator<Employee> {
int id,age;
String name;
long number;


public Employee(int id, int age, String name, long number) {
	super();
	this.id = id;
	this.age = age;
	this.name = name;
	this.number = number;
}

public Employee() {
	
}

@Override
public int compare(Employee o1, Employee o2) {

	
	return 0;
}

@Override
public String toString() {
	return "id=" + id + ", age=" + age + ", name=" + name + ", number=" + number;
}
}
