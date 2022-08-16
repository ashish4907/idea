
public class test9 {
	public static void main(String[] args) {
		GenericInterface <String>gi = (str)->{
			System.out.println(str);
			return str;
			
		};
		gi.func("Ashish");
		
		GenericInterface <Integer> gii = (a)->{
			System.out.println(a);
			return a;
			};
		gii.func(10);
	}

}
