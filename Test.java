import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		ArrayList<Student> studentlist = new ArrayList<Student>();
		studentlist.add(new Student(103,"Nidhi"));
		studentlist.add(new Student(105,"Megha"));
		studentlist.add(new Student(101,"Shreya"));
		studentlist.add(new Student(104,"Shraddha"));
		studentlist.add(new Student(102,"Shivani"));
		
		Test test = new Test();
		System.out.println("--------- Before Sorting-----------------");
		test.toIterate(studentlist);
		
		System.out.println("--------- After Sorting-----------------");
		List<Student> sortedList = test.getSorted(studentlist);
		test.toIterate(sortedList);
		}
	private List<Student> getSorted(List<Student> list){
		list.sort((o1,o2) -> o1.name.compareTo(o2.name));
		return list;
	}
	
	private void toIterate(List<Student> list) {
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
	
	

}
