package Lambda;

interface Hello{
	void hello();
}
public class StaticMethodReference {

	public static void helloPlease() {
		System.out.println("hello this is static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Referring static method
		Hello h = StaticMethodReference :: helloPlease;
		
		//calling interface method
		h.hello();
	}

}
