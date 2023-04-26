package SerializationConcepts;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializablePersonObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person(1,"Prajwal");
		try {
			FileOutputStream fos= new FileOutputStream("person.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p1);
			oos.close();
			System.out.println("Task Completed");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
