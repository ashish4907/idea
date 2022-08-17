import java.util.Comparator;

public class Students implements Comparator<Object>{
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public int compare(Object o1, Object o2) {
	
	return 0;
}

}
