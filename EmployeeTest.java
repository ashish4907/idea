import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {
	public static void main(String[] args) {

		ArrayList<Employee> employeelist = new ArrayList<Employee>();
		employeelist.add(new Employee(103, "Nidhi", 25, 8292891949l));
		employeelist.add(new Employee(105, "Megha", 18, 7291939779l));
		employeelist.add(new Employee(101, "Shreya", 34, 7979811120l));
		employeelist.add(new Employee(104, "Shraddha", 53, 7549390260l));
		employeelist.add(new Employee(102, "Shivani", 21, 9570834940l));

		EmployeeTest employeetest = new EmployeeTest();
		System.out.println("---------- Before Sorting--------------");
		employeetest.toIterate(employeelist);

		System.out.println("---------- After Sorting--------------");
		List<Employee> sortedlist = employeetest.getSorted(employeelist);
		employeetest.toIterate(sortedlist);

	}

	private List<Employee> getSorted(List<Employee> list) {

		list.sort((o1, o2) -> {
			if(o1.name.compareTo(o2.name)!=0) {
				return (o1.name).compareTo(o2.name);
				
			}
			
			else if (o1.name.equals(o2.name)) {
				return o1.id - o2.id;
			}

			else if (o1.id == o2.id) {

				return o1.age - o2.age;
			} else if (o1.age == o2.age) {
				return Long.compare(o1.phoneNumber, o2.phoneNumber);
			} else {
				return (o1.name).compareTo(o2.name);
			}
		});
		return list;
	}

	private void toIterate(List<Employee> list) {
		Iterator<Employee> iterator = list.iterator();
		while (iterator.hasNext()) {
			Employee iter = iterator.next();
			System.out.println(iter.id + " " + iter.name + " " + iter.age + " " + iter.phoneNumber);
		}
	}

}
