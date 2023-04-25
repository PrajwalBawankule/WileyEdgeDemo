package StringClasses;

public class StringBuilderClass {

	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("wiley");
//		System.out.println(sb);
//		sb.append("_edge");
//		System.out.println(sb);
		//"[timestamp user : userId, message: logged in successfully]"
		
		StringBuilder logMessage = new StringBuilder();
		long timestamp = System.currentTimeMillis();
		
		logMessage
		.append("[")
		.append(timestamp)
		.append("] ");
		
		int userId = 123;
		logMessage
		.append("User ")
		.append(userId)
		.append(": ");
		
		String msg = "Logged in successfully";
		logMessage.append(msg);
		
		System.out.println(logMessage.toString());
		
	}
}
