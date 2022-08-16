
interface MyInterfaces{
	public String say(String name);
	
}
public class test2 {
	public static void main(String[] args) {
		MyInterfaces ref =(name)->{
			return name;
		};
		
		System.out.println(ref.say("Shraddha"));
	}
	

}
