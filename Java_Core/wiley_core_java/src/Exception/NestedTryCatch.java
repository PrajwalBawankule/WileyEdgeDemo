package Exception;

public class NestedTryCatch {
	public static void main(String[] args) {
		try {
			try {
				System.out.println("Hii");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
//			try {
//				System.out.println(10/0);
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("Intside this block");
//				e.printStackTrace();
//			}
			try {
				System.out.println("11111");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(10/0);
			System.out.println("Hello...");

			
		} catch(Exception e) {
			System.out.println("Catch Block");
			//System.out.println(10/0);
			e.printStackTrace();
			try {
				System.out.println(10/0);
			} catch (Exception ee) {
				// TODO: handle exception
				System.out.println("Inside this catch block exception");
				ee.printStackTrace();
			}
		} finally {
			System.out.println("Close connection");
			try {
				System.out.println(10/0);
			} catch (Exception e1) {
				// TODO: handle exception
				System.out.println("Intside this finally block exception");
				e1.printStackTrace();
			}
		}
	}
}
