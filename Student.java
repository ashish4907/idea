import java.util.Comparator;

public class Student implements Comparator<Object>{
int id;
String name;
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Student() {
	
}
@Override
public int compare(Object o1, Object o2) {
	
	return 0;
}
@Override
public String toString() {
	return id +" "+ name;
}









}
