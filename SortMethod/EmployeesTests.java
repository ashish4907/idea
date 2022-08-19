import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EmployeesTests {
	public static void main(String[] args) {

		Employees e1 = new Employees();
		e1.setId(103);
		e1.setAge(25);
		e1.setName("Nidhi");
		e1.setPhoneNumber(8292891949l);

		Employees e2 = new Employees();
		e2.setId(105);
		e2.setAge(18);
		e2.setName("Megha");
		e2.setPhoneNumber(7291939779l);

		Employees e3 = new Employees();
		e3.setId(101);
		e3.setAge(34);
		e3.setName("Megha");
		e3.setPhoneNumber(7979811120l);

		Employees e4 = new Employees();
		e4.setId(105);
		e4.setAge(53);
		e4.setName("Shraddha");
		e4.setPhoneNumber(7549390260l);

		Employees e5 = new Employees();
		e5.setId(102);
		e5.setAge(53);
		e5.setName("Shivani");
		e5.setPhoneNumber(8292891949l);

		ArrayList<Employees> employeeslist = new ArrayList<Employees>();
		employeeslist.add(e1);
		employeeslist.add(e2);
		employeeslist.add(e3);
		employeeslist.add(e4);
		employeeslist.add(e5);

		EmployeesTests employeestests = new EmployeesTests();
		employeestests.toIterate(employeeslist);

		System.out.println("---------- After Sorting--------------");
		List<Employees> sortedlist = employeestests.getSorted(employeeslist);
		employeestests.toIterate(sortedlist);
//		employeestests.toIterateBackward(employeeslist.size());
		

	}

	

	private List<Employees> getSorted(List<Employees> list) {
		list.sort((o1, o2) -> {
			if ((o1.getName()).compareTo(o2.getName()) != 0) {
				return (o1.getName()).compareTo(o2.getName());
			} else if (o1.getName().equals(o2.getName())) {
				return o1.getId() - o2.getId();
			} else if (o1.getId() == o2.getId()) {
				return o1.getAge() - o2.getAge();
			} else if (o1.getAge() == o2.getAge()) {
				return Long.compare(o1.getPhoneNumber(), o2.getPhoneNumber());
			} else {
				return (o1.getName()).compareTo(o2.getName());
			}

		});
		return list;
	}

	private void toIterate(List<Employees> list) {
		Iterator<Employees> iterator = list.iterator();
		while (iterator.hasNext()) {
			Employees iter = iterator.next();
			System.out.println(iter.getId() + " " + iter.getName() + " " + iter.getAge() + " " + iter.getPhoneNumber());
		}
	}
	
//	private void toIterateBaint size) {
//		ListIterator<Employees> iterator = list.listIterator();
//		while (iterator.hasNext()) {
//			Employees iter = iterator.next();
//			System.out.println(iter.getId() + " " + iter.getName() + " " + iter.getAge() + " " + iter.getPhoneNumber());
//		}
//	}
	

	

}
