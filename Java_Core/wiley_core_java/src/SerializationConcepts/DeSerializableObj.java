package SerializationConcepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializableObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fis = new FileInputStream("books.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Book b = (Book) ois.readObject();
			System.out.println("Book code: "+b.bookCode);
			System.out.println("Book Name: "+b.bookName);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
