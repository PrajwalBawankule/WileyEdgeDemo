package Wiley_Core_Java;

public class CreateClass implements Cloneable {
	
	int a =10;
	public void add() {
		System.out.println("Number adding");
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException {
		
		//create object with new keyword
		CreateClass cc = new CreateClass();
		cc.add();
		System.out.println(cc);
		
		//create object with newInstance()
		try {
			Class c = Class.forName("Wiley_Core_Java.CreateClass");
			CreateClass ci = (CreateClass) c.newInstance();
			ci.add();
			System.out.println(ci);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		//create object with object.clone()
		CreateClass objClone = (CreateClass) cc.clone();
		objClone.add();
		System.out.println(objClone);
	}
}
