package Lambda;

@FunctionalInterface
interface Calc{
	int calculate(int val);
}
public class FunctionalInterfaceClass {

	public static void main(String[] args) {
		
		//implement abstract method of calc class
		Calc cl = (int val) -> val + 55;
		
		System.out.println("result = "+cl.calculate(23));
		
	}
}
