package Lambda;

public class LambdaClass {

	static String printThing(Printable thing) {
		return thing.print("!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product myProd = new Product();
		//myProd.print();
		
		//printThing(myProd);
		
//		printThing(() -> {
//				System.out.println("This is lambda function");
//			});
		
//		printThing(() -> System.out.println("This is a lambda function"));
	
//		Printable lambdaPrinciple = (s) -> System.out.println("Expression");
//		printThing(lambdaPrinciple);
		
//		Printable lambdaPrinciple = s -> System.out.println("Expression"+s);
//		printThing(lambdaPrinciple);
//		
		//two arguments
//		Printable lambdaPrinciple = (p,s) -> System.out.println("Expression"+s);
//		printThing(lambdaPrinciple);
		
		//with returntype
		Printable lambdaPrinciple1 = s -> {
			return ("Wiley"+s);
			
		};
		System.out.println(printThing(lambdaPrinciple1));
		
	}

}
