package Lambda;


//single abstract method
//static and default methods acn be there

@FunctionalInterface
public interface Printable {

//	void print();
	
//	void print(String suffix);
	
//	void print(String prefix,String suffix);
	
	String print(String suffix);
	
	default void sayHi() {
		
	}
	public static void sayOk() {
		
	}
}
