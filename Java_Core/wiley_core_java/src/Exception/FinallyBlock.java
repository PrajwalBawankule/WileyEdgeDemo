package Exception;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			System.out.println("Hii");
			System.out.println(10/0);
			System.exit(0);
		} catch(Exception e) {
			System.out.println("Catch Block");
			//System.out.println(10/0);
			e.printStackTrace();
		} finally {
			System.out.println("Close connection");
		}
	}
}
