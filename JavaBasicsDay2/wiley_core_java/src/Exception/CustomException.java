package Exception;

class AgeNotValid extends Exception{
	public AgeNotValid(String message) {
		super(message);
	}

	public String getMessage() {
		return "this is not valid age";
	}
//	public String toString() {
//		return "age not applicable";
//	}
}
public class CustomException {
	public static void getAge(int age) throws AgeNotValid{
		if(age > 18) {
			try {
				throw new AgeNotValid("Age not valid");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				
			}
		}
		else {
			System.out.println("Age valid");
		}
	}
	public static void main(String[] args) throws AgeNotValid{
		getAge(8);
		getAge(20);
	}
}
