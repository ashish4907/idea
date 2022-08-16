import java.util.Comparator;

public class Mobile implements Comparator<Mobile> {
String name;
int price;
public Mobile(String name, int price) {
	
	this.name = name;
	this.price = price;
}

public Mobile() {
	
}

@Override
public int compare(Mobile o1, Mobile o2) {
//	if(o1.name.equals(o2.name))  {
//	return o1.price-o2.price;
//	}
	return o1.name.compareTo(o2.name);
	
}

@Override
public String toString() {
	return "Mobile [name=" + name + ", price=" + price + "]";
}




}
