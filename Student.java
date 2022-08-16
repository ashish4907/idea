
import java.util.Comparator;

public class Student implements Comparator<Student> {
int id;
String name;
@Override
public int compare(Student o1, Student o2) {
	return o2.name.compareTo(o1.name);
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Student() {
	super();
}





}