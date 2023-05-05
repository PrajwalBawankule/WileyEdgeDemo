package Lambda;

@FunctionalInterface
public interface Child extends Parent {
	public void sayHello(); // in functional interface same method can be overriden but cannot have other abstract method as alreaddy one is inherited from parent interface
	
	default void sayHi() {
		
	}
	
	//Methods of predefined object class can be there
	String toString(); 
	int hashCode();
	boolean equlas(Object obj);
}
