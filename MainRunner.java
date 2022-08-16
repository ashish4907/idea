
public class MainRunner {
public static void main(String[] args) {
	
	Add add =(int a) ->
	System.out.println(a*a);
	add.add(10);
	
	Add adds = a -> System.out.println(a*a);
	adds.add(12);
	

	AddParameter addpar = a -> {
		System.out.println(a*a);
		return a;
		
	};
	addpar.add(11);
	System.out.println(addpar);
}
}
