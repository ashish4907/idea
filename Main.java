import java.util.ArrayList;

public  class Main {
public static void main(String[] args) {
	
	Mobile m1 = new Mobile("Apple",5600);
	Mobile m2 = new Mobile("Oppo",36600);
	Mobile m3 = new Mobile("Samsung",22070);
	Mobile m4 = new Mobile("Oppo",16800);
	Mobile m5 = new Mobile("Redmi",8000);
	
	ArrayList<Mobile> list = new ArrayList<Mobile>();
	list.add(m1);
	list.add(m2);
	list.add(m3);
	list.add(m4);
	list.add(m5);
	
	list.sort(new Mobile());
	System.out.println(list);
	
	
	




}
	
}

