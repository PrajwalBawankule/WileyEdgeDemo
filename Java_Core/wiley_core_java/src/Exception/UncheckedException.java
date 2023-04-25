package Exception;
import java.util.ArrayList;

class StudentNotFound extends RuntimeException{
	public StudentNotFound(String msg) {
		super(msg);
	}
//	public String getMessage() {
//		return "this student is not present";
//	}
	public String toString() {
		return "student not applicable";
	}
}

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s = new ArrayList<>();
		
		s.add("Prajwal");
		s.add("abc");
		s.add("xyz");
		
		if (!s.contains("Prajwal111")) {
			try {
				throw new StudentNotFound("This student is not found");
			} catch (StudentNotFound e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println(e.toString());
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("Message hello");
	}

}
