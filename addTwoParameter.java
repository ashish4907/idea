interface NameInterface{
	void add(int a,int b,int c);
	int hashCode();
}
interface NamesInterface{
	int add(int a, int b);
}
interface NamessInterface{
	int add(int a, int b);
}

public class addTwoParameter {
	static NamessInterface namess =(a,b)->  a*b;
	
public static void main(String[] args) {
	NameInterface name =(a,b,c)-> System.out.println((a+b)*c);
	name.add(10,20,30);
	
	NamesInterface names =(a,b)-> {
		System.out.println(a+b);
		return a+b;
	};
	names.add(10,20);
	
	System.out.println(namess.add(10,20));
		
}
}
