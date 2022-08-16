import java.util.ArrayList;


public  class Mains {
public static void main(String[] args) {
	
	Employee m1 = new Employee(10,29,"Shreya",123456789);
	Employee m2 = new Employee(20,25,"Shivani",123456789);
	Employee m3 = new Employee(30,27,"Sony",345678912);
	Employee m4 = new Employee(30,29,"Shraddha",567891234);
	Employee m5 = new Employee(50,21,"Sony",789123456);
	
	
	ArrayList<Employee> list = new ArrayList<Employee>();
	list.add(m1);
	list.add(m2);
	list.add(m3);
	list.add(m4);
	list.add(m5);
	
//	list.sort(new Employee());
	list.sort((o1,o2) -> {
		if(o1.name.equals(o2.name)) {
			return o1.id-o1.id;
			}
		else if(o1.id==o2.id) {
			return o1.age-o2.age;
		}
		else if(o1.age == o2.age) {
			return  (int) (o1.number-o2.number);
		}
		
		return o1.name.compareTo(o2.name);
	});
	
	System.out.println(list);
}
	
}

