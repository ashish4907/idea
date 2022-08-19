import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparator<Object>{
int id;
String name;
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}

@Override
public int hashCode() {
	return Objects.hash(id);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return id == other.id;
}
public Object compareTo(Employee o1) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public int compare(Object o1, Object o2) {
	// TODO Auto-generated method stub
	return 0;
}


}
