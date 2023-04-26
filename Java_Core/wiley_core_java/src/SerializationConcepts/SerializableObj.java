package SerializationConcepts;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book(108,"Java");
		
		try {
			FileOutputStream fos = new FileOutputStream("books.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(b1);
			fos.close();
			System.out.println("Task completed");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
