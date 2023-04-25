package Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First statement");
		int arr[] = {1,2,3,4,5};
		try {
			System.out.println(arr[2]);
			System.out.println(arr[1]);
			
			System.out.println("Second statement");
			int a = 11/0;
			String s = "Prajwal";
			System.out.println(s.charAt(8));
			
			System.out.println("Third statement");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Catch Block 2");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Catch Block 3");
			e.printStackTrace();
			System.out.println("Exception handled");
		} 
		System.out.println("Another statement");
	}

}
