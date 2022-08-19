import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tests {
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.setId(103);
		s1.setName("Nidhi");
		Students s2 = new Students();
		s2.setId(105);
		s2.setName("Megha");
		Students s3 = new Students();
		s3.setId(101);
		s3.setName("Shreya");
		Students s4 = new Students();
		s4.setId(104);
		s4.setName("Shraddha");
		Students s5 = new Students();
		s5.setId(102);
		s5.setName("Shivani");
		
	ArrayList<Students> studentlist = new ArrayList<Students>();
	studentlist.add(s1);
	studentlist.add(s2);
	studentlist.add(s3);
	studentlist.add(s4);
	studentlist.add(s5);
	
	Tests tests = new Tests();
	System.out.println("--------- Before Sorting-----------------");
	tests.toIterate(studentlist);
	
	System.out.println("--------- After Sorting-----------------");
	
	List<Students> sortedlist = tests.getSorted(studentlist);
	tests.toIterate(sortedlist);
	}
	private List<Students> getSorted(List<Students> list){
//		list.sort((o1,o2) -> o1.getName().compareTo(o2.getName()));
		list.sort((o1,o2)-> o1.getId()-o2.getId());
		return list;
	}
	
	private void toIterate(List<Students> list) {
		Iterator<Students> iterator = list.iterator();

		
		 while (iterator.hasNext()) {
	        	Students iter = iterator.next();
	        	System.out.println(iter.getId() + " " + iter.getName());
	        }
		
	}

}
