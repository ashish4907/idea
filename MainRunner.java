import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MainRunner {
	public static void main(String[] args) {
		Employees e1 = new Employees();
		e1.setId(101);
		e1.setAge(31);
		e1.setName("Shreya");
		e1.setNumber(123456789);
		
		Employees e2 = new Employees();
		e2.setId(105);
		e2.setAge(29);
		e2.setName("Megha");
		e2.setNumber(234567890);
		
		Employees e3 = new Employees();
		e3.setId(104);
		e3.setAge(18);
		e3.setName("Megha");
		e3.setNumber(345678921);
		
		Employees e4 = new Employees();
		e4.setId(104);
		e4.setAge(21);
		e4.setName("Shivani");
		e4.setNumber(456789012);
		
		Employees e5 = new Employees();
		e5.setId(103);
		e5.setAge(18);
		e5.setName("Shraddha");
		e5.setNumber(678912345);
		
		
		
		LinkedList<Employees> linkedlist = new LinkedList<Employees>();
		linkedlist.add(e1);
		linkedlist.add(e2);
		linkedlist.add(e3);
		linkedlist.add(e4);
		linkedlist.add(e5);
		
		ArrayList<Employees> list = new ArrayList<Employees>();
		list.addAll(linkedlist);
		
    list.sort((o1,o2) -> {
    		if(o1.getName().equals(o2.getName())) {
    			return o1.getId()-o1.getId();
    			}
    		else if(o1.getId()!=o2.getId()) {
    			return o1.getId()-o2.getId();
    		}
    		else if(o1.getAge() != o2.getAge()) {
    			return  o1.getAge()-o2.getAge();
    		}
    		return (int) (o1.getNumber()-o2.getNumber());
    	});
    	
        Iterator<Employees> iterator = list.iterator();
        while (iterator.hasNext()) {
        	Employees iter = iterator.next();
        	System.out.println(iter.getId() + " " + iter.getName() + " " 
        	+ iter.getAge() + " " + iter.getNumber());
        }
        
        System.out.println("-----------ArrayList in backward direction----------");
        ListIterator<Employees> iteratorlist = list.listIterator(list.size());

        while (iteratorlist.hasPrevious()) {
            Employees iterlist = iteratorlist.previous();
            System.out.println(iterlist.getId() + " " + iterlist.getName() + " " + iterlist.getNumber() + " "
                    + iterlist.getAge());
        }
        
	}
}
